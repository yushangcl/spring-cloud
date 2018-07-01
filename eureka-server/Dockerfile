FROM maven:3.5-jdk-8-alpine AS build
LABEL Author="gayhub@live.cn"

WORKDIR /src
RUN apk add --no-cache git \
    && git clone https://github.com/yushangcl/spring-cloud.git \
    && cd spring-cloud/eureka-server \
    && mvn package -Dmaven.test.skip=true
# spring-cloud/eureka-server
FROM logr/8-jre-alpine
COPY --from=build /src/spring-cloud/eureka-server/target/eureka-server-0.0.1-SNAPSHOT.jar .
RUN mv eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar

#执行
CMD java -jar eureka-server.jar
