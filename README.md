# Read Me First
Simple steps to work with docker using springboot + Gradle + Docker (docker-hub)
The following was discovered as part of building this project:

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/gradle-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

# Docker Commands

* docker run <image> -> To run an existing docker image
* docker run -p 5000:5000 <image> -> To run an existing docker image on port 5000
* docker images -> To see list of images -> Images are static version
* docker container ls or docker ps -> list of containers are running -> Containers are running version of images
* docker container ls -a or docker ps -a -> list all containers 
* docker container start <Container_name or Container_Id> -> To start an exited container
* docker container stop <Container_name or Container_Id> -> To stop a started container
* docker container logs <Container_name or Container_Id> -> To see the status of a container
* docker container rm <Container_name or Container_Id> -> To remove a stop container
* docker container prune -> This will remove all stopped containers
* docker container inspect <Container_name or Container_Id> -> To see the container details
* docker image history <image_name or image_id:tag> -> To see the history of an image
* docker image remove <image_name or image_id:tag> -> This will remove an image

## build image by command line
* docker login -> to longin to docker hum
    -> username: asad02
    -> pass: token from file
* docker run -dit openjdk:8-jdk-alpine -> Download jdk 8 to local repo
* docker cp docker-demo-0.0.1-SNAPSHOT.jar <Container_Id>:/tmp -> copy the jar into container's tmp folder
* docker container commit --change='CMD ["java", "-jar", "/tmp/docker-demo-0.0.1-SNAPSHOT.jar"]' focused_lichterman docker-demo:v2
* docker container exec <Container_Id or Container_Name> ls /tmp -> To check if jar is copied on the container or not
* docker container exec <Container_Id or Container_Name> ls /tmp -> To check if jar is copied on the container or not
* docker container commit focused_lichterman docker-demo:v1 -> Create an image from the container
* docker run -d -p 8080:8080 docker-demo:v2 -> run an image
* docker logs <Container_Id> -> To see the status or log of a running container
## build docker image tag it and push
* docker build -t <image_name> . or docker build -t <image_name>:latest . -> Build docker image
* docker tag <image_name> <repo> -> docker tag docker-demo asad02/docker-demo
* docker push asad02/docker-demo -> Push the image to the repo (asad02/docker-demo) created from previous step
* docker pull asad02/docker-demo -> To pull am image from remote repo
