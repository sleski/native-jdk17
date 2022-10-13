#!/bin/bash
set -e

./mvnw clean

./mvnw package -Pnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native-micro -t quarkus/native-jdk17 .

docker run -i --rm --name native_jdk17 --env PORT=8081 -p 8081:8081 quarkus/native-jdk17

echo '-----------  DONE ---------'

