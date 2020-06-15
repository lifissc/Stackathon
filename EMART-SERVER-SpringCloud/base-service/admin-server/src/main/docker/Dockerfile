FROM java:8

VOLUME /tmp
ADD adminServer 0.0.1-SNAPSHOT.jar adminapp.jar
RUN bash -c 'touch /adminapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/adminapp.jar"]