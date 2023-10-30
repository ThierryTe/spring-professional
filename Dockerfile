FROM maven:3.9.5-openjdk-17
WORKDIR /restfull-web-services
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run
