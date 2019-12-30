FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY build/libs/com.mservice.dvcwrapper-*-all.jar DVCWrapper.jar
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar DVCWrapper.jar

#FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
#COPY . /home/app/micronautguide
#WORKDIR /home/app/micronautguide
#RUN gu install native-image
#RUN native-image --no-server -cp build/libs/complete-*-all.jar
#
#FROM frolvlad/alpine-glibc
#EXPOSE 8080
#COPY --from=graalvm /home/app/micronautguide /app/micronautguide
#ENTRYPOINT ["/app/micronautguide","-Xmx68m"]