FROM openjdk:22
EXPOSE 8080
ADD target/learning-k8s.jar learning-k8s.jar

ENTRYPOINT ["java", "-jar", "/learning-k8s.jar"]