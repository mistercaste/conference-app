# Open Space Software Development

## Developer Quickstart

```
cd monitoring
mvn clean install 
java -jar target/monitoring-1.0.0.jar

cd app
mvn clean install
java -jar target/conference-app-3.0.0.war
```

### Open WebApp
http://localhost:8080

### Open Monitoring App
http://localhost:8888

#### Credits (c)

Original version by [www.codecentric.de](https://www.codecentric.de): [codecentric/conference-app](https://github.com/codecentric/conference-app).

Original article: [Javaland OpenSpace Software Development](https://www.codecentric.de/2015/03/18/javaland-openspace-software-development/)

This version introduced new features like Jenkins Seed & Pipelines.
