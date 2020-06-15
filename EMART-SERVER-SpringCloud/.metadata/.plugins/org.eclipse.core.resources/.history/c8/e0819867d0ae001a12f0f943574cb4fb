FROM java:8

VOLUME /tmp
ADD configServer 0.0.1-SNAPSHOT.jar configapp.jar
RUN bash -c 'touch /configapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/configapp.jar"]