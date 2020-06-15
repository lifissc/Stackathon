FROM java:8

VOLUME /tmp
ADD payServ 0.0.1-SNAPSHOT.jar payServapp.jar
RUN bash -c 'touch /payServapp.jar'

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/payServapp.jar"]