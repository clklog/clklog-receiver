FROM openjdk:8

VOLUME /tmp
ARG JAR_FILE
ENV JAVA_OPTS=
ENTRYPOINT ["entrypoint.sh"]
EXPOSE 8080
COPY docker-entrypoint.sh /usr/local/bin/entrypoint.sh
COPY ./iplib/* /iplib/
COPY ./project-setting.json /
COPY ${JAR_FILE} app.jar
