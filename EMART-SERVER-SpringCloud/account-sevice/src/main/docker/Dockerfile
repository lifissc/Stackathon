FROM java:8

VOLUME /tmp
ADD accountServ 0.0.1-SNAPSHOT.jar accountapp.jar
RUN bash -c 'touch /accountapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/accountapp.jar"]