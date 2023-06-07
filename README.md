# BasicRESTApi
A basic start for the docker workshop

## How to
### Create api
Either pull this repo or use you own api

### Setup confg file
``` java
server.port=5000
spring.data.mongodb.uri=mongodb://mongodb/docker-db
```

### Pull docker images
``` powershell
docker pull openjdk:20
docker pull mongo
```

### Create Docker file
Create a "Dockerfile" in you dicertory
```
FROM openjdk:8
ADD target/{appname}.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Create docker-compse file
Create a "docker-compose.yml" in you dicertory
```
version: "3.8"

services:
  mongo:
    image: mongo:latest
    container_name: "mongodb"
    ports:
      - "27017:27017"
    volumes:
      - mongodbdata:/data/db

  my-docker-app:
    build: .
    container_name: "docker-app"
    ports:
      - "5000:5000"

volumes:
  mongodbdata:
```

### Build the project
``` powershell
mvn clean package -DskipTests
```

### Build the docker image
``` powershell
docker-compose build
```

### Create a docker container
``` powershell
docker-compose up -d
```

