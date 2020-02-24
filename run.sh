#!/bin/bash
cd nginx
docker image build -t custom-nginx:latest .
cd ..
mvn clean package
docker image build -t v1/calc .
docker-compose up -d