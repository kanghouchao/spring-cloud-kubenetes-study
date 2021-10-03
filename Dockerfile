FROM store/oracle/serverjre:1.8.0_241-b07
WORKDIR /data
ADD target/configmap-study-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]