# Use uma imagem base com JDK 17
FROM eclipse-temurin:17-jdk-alpine as builder

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo de build (pom.xml) e os arquivos de dependências (se existirem)
COPY pom.xml .

# Copie os arquivos de dependências (se existirem)
COPY .mvn .mvn
COPY mvnw .

# Baixe as dependências do projeto
RUN ./mvnw dependency:go-offline -B

# Copie o código fonte do projeto para o container
COPY src ./src

# Compile a aplicação Spring Boot
RUN ./mvnw package -DskipTests

# Utilize uma imagem base mais leve para rodar a aplicação
FROM eclipse-temurin:19-jre-alpine

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o jar gerado na fase de build para a imagem final
COPY --from=builder /app/target/*.jar app.jar

# Exponha a porta em que a aplicação Spring Boot será executada
EXPOSE 8080

# Defina o comando para rodar a aplicação Spring Boot
ENTRYPOINT ["java","-jar","app.jar"]
