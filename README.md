REST-APIkit-ESB-Mule
====================

This application illustrates an API implementation using Anypoint Studio's tooling for building REST APIs with RAML interfaces:APIkit.

The application takes a RAML file and maps it to an implementation of an API in Mule. This example implementation mocks a Spring backend.

APIkit

APIkit is an open-source, declarative toolkit specially created to facilitate REST API implementation with RAML definitions.

As a simple framework that caters to API-first development, it enforces good API implementation practices. 

This document describes the details of the example within the context of Anypoint Studio, Mule ESB’s graphical user interface
and includes configuration details for both the visual and XML editors.. 

Example:

This API allows  to add, remove, and retrieve information about sports teams participating in a league tournament. 

1.	Create  ,then run the example application in Anypoint Studio

2.	Anypoint Studio starts the application and automatically opens an API console below the canvas.
 
3.Click GET for the /teams resource.

4.The console opens a details panel for the GET method for this resource that allows you to view details about the request format and expected responses, as well as a Try It option.

5.Click Try It. Enter Madrid in the city field, then click GET.

6.Scroll down to view the response. The API returned a list of teams associated with the city Madrid.

7.Click through the other resources and methods to test out other API calls

the base URI to  access the console for this API at http://localhost:8080/api/console

Building

To build the simple project and run the Test Suite, perform the following command:

mvn clean install
