[Introduction](#introduction)

[Network Client Service Design](#network-client-service-design)
  * [Technology Stack](#technology-stack)

[Network Client Service REST Endpoints](#network-client-service-rest-endpoints)
  * [Multiply 2 Numbers](#multiply-2-numbers)
  * [Divide 2 Numbers](#divide-2-numbers)
  * [Add 2 Numbers](#add-2-numbers)


## Introduction

This a REST service which exposes end-points that accepts requests with json format and reply in json format.

The REST service are handling simple operations like multiply , add and divide two numbers.
  
The application is be able to handle multiple concurrent requests.

## Network Client Service Design

a server application that accepts requests over the network and sends those request to a second server. Have the second server respond to the requests of the client via the first server.


## Network Client Service REST Endpoints

 #### Multiply 2 Numbers
 
 curl -X POST "http://localhost:8080/api/v1/calc/multiply" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"firstNumber\": 10, \"secondNumber\": 200}"
 
 {
   "input": {
     "firstNumber": 10,
     "secondNumber": 200
   },
   "result": 2000
 }
 
 
 #### Divide 2 Numbers
 curl -X POST "http://localhost:8080/api/v1/calc/divide" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"firstNumber\": 10, \"secondNumber\": 2}"
 
 Response body
 
 {
   "input": {
     "firstNumber": 10,
     "secondNumber": 2
   },
   "result": 5
 }
 
 #### Add 2 Numbers
 
 curl -X POST "http://localhost:8080/api/v1/calc/add" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"firstNumber\": 19, \"secondNumber\": 20}"
 	
Response body
{
  "input": {
    "firstNumber": 19,
    "secondNumber": 20
  },
  "result": 39
}