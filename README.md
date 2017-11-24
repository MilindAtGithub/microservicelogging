# microservicelogging
This source code will give the idea about how to do effective logging in microservice.

Dynamic Change Log Level:
curl -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "ERROR"}' http://localhost:9001/loggers/com.milind

Take log out side of Docker Container:
docker run -d -p 9001:9001 -v $PWD/:/tmp testlogging/microservicelogging
