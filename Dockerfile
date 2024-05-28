FROM gradle:7.6-jdk17-alpine as build

ENV APP_HOME=/v

WORKDIR $APP_HOME

COPY build.gradle settings.gradle gradlew $APP_HOME

COPY gradle $APP_HOME/gradle

# COPY . .

# RUN ls -l

# RUN pwd

RUN ls -l gradle/wrapper/

RUN ./gradlew build 

RUN ls -l 



COPY src $APP_HOME/src

RUN  chmod +x gradlew

RUN ./gradlew build


FROM openjdk:17.0.2-jdk

ENV APP_HOME=/apps

ARG ARTIFACT_NAME=app.jar
# ARG JAR_FILE_PATH=build/libs/[프로젝트명]-0.0.1-SNAPSHOT.jar 
ARG JAR_FILE_PATH=build/libs/nasdaq-0.0.1-SNAPSHOT.jar 

WORKDIR $APP_HOME

COPY --from=build $APP_HOME/$JAR_FILE_PATH $ARTIFACT_NAME

EXPOSE 8080

#ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]