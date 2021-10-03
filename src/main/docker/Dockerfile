FROM store/oracle/serverjre:1.8.0_241-b07
ADD target/spring-cloud-kubernets-study-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
