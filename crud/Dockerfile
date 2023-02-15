FROM adoptopenjdk/openjdk11:jre-11.0.9_11.1-alpine 

MAINTAINER "Augusto A A Freire, version 0.1"

ADD target/crud-0.0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]



# 1. Gerando Imagem Docker:
# docker build -t crud_springboot .
#
# 2. Executando container em docker:
# docker run --add-host=host.docker.internal:172.17.0.1 --name crud_springboot -p 8080:8080 -d crud_springboot 
#
# 3. Testar:
# http://localhost:8080/
