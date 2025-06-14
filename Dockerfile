FROM eclipse-temurin:21-jdk-alpine

LABEL authors="michaelcordero"

WORKDIR /product

COPY build/libs/Product.jar Product.jar

EXPOSE 8080 5005

ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "Product.jar"]
