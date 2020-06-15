FROM java:8

VOLUME /tmp
ADD orderServ 0.0.1-SNAPSHOT.jar orderapp.jar
RUN bash -c 'touch /orderapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/orderapp.jar"]