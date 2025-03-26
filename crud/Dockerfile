# Etapa 1: Compilação do código-fonte
FROM maven:3.8.6-openjdk-11 AS builder
WORKDIR /app

# Copiar o pom.xml e baixar dependências para cache otimizado
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar o código-fonte e compilar o projeto
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem final mais leve
FROM adoptopenjdk/openjdk11:jre-11.0.9_11.1-alpine
WORKDIR /app

# Copiar o JAR gerado da etapa de build
COPY --from=builder /app/target/crud-0.0.1.jar app.jar

# Expor a porta da aplicação
EXPOSE 8080

# Definir o comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]


# 1. Gerando Imagem Docker:
# docker build -t srm_api .
#
# 2. Executando container em docker:
# docker run --add-host=host.docker.internal:172.17.0.1 --name srm_api -p 8080:8080 -d srm_api 
#
# 3. Testar:
# http://localhost:8080/

# 1. Gerando Imagem Docker:
# docker build -t crud_springboot .
#
# 2. Executando container em docker:
# docker run --add-host=host.docker.internal:172.17.0.1 --name crud_springboot -p 8080:8080 -d crud_springboot 
#
# 3. Testar:
# http://localhost:8080/
