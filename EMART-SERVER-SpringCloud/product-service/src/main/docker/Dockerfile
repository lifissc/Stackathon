FROM java:8

VOLUME /tmp
ADD productSer 0.0.1-SNAPSHOT.jar productSerapp.jar
RUN bash -c 'touch /productSerapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/productSerapp.jar"]