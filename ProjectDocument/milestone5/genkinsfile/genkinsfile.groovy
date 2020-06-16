pipeline{
  agent any
  stages {
        stage('Get Source Code') {
            steps {
                git branch: 'master',
                credentialsId: 'my_cred_id',
                url: 'https://github.com/lifissc/Stackathon.git'

                sh "ls -lat"
            }
        }
        stage('complie code') {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true -f EMART-SERVER-SpringCloud/pom.xml'
            }
        }
        stage('deploy') {
            steps {
                sh 'cd EMART-SERVER-SpringCloud\base-service\eureka-server; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\base-service\admin-server; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\base-service\conf-server; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\account-sevice; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\payment-service; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\product-service; mvn spring-boot:run'
                sh 'cd EMART-SERVER-SpringCloud\order-service; mvn spring-boot:run'
            }
        }
  }
  post {
        failure {
            emailext body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
                              <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
            subject: "[FAILED]: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
            to: "${env.gitUserName}"
        }
    }
}
