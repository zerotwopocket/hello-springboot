# Hello Springboot

Simple spring boot web app. 

## How to run


### Springboot Maven Plugin

```shell
mvn clean spring-boot:run
```

### Docker

```shell
mvn clean package
docker build -t <name-of-image> .
docker run --name <name-of-container> -p <hostmapping>:8080 <name-of-image>
```
where:

- `<name-of-image>` is the name you want for the docker image that will be created
- `<name-of-container>` is the name you want for the docker container that will be created
- `<hostmapping>` is the port where you want to access the container from your host machine

for example, the following commands:
```shell
docker build -t 02pocket/hello-springboot .
docker run --name hello-springboot -p 9090:8080 02pocket/hello-springboot
```
will create an image named `02pocket/hello-springboot` and a container named `hello-springboot`. 
To consume the service, try to access http://localhost:9090/hello?message=zehahaha in the web browser

### Docker compose
```shell
mvn clean package
docker compose -f src/main/docker/docker-compose.yml up
```

### Script
TODO
