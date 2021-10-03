FROM store/oracle/serverjre:1.8.0_241-b07
MAINTAINER kanghouchao
WORKDIR /workspace
ADD maven/assembly-tmp.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]
