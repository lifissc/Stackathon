FROM java:8

VOLUME /tmp
ADD zuulServer 0.0.1-SNAPSHOT.jar zuulapp.jar
RUN bash -c 'touch /zuulapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/zuulapp.jar"]