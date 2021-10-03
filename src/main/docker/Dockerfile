FROM store/oracle/serverjre:1.8.0_241-b07
MAINTAINER kanghouchao
ADD maven/$JAR_FILE_NAME.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
