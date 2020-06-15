FROM java:8

VOLUME /tmp
ADD eurekaServer 0.0.1-SNAPSHOT.jar eurekaapp.jar
RUN bash -c 'touch /eurekaapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eurekaapp.jar"]