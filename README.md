# warehouse software

## Tools and Technologies Used
Java 1.8
SpringBoot
JPA
RESTFul WebService
Tool for sending information to web services (Postman)
MySQL - Database
Maven – Build tool
GitHub – Code Delivery and 
STS – Spring Tool Suite for IDE Windows 10

## About the Assignment
The assignment is to implement a warehouse software. This software should hold articles, and the articles should contain an identification number, a name and available stock. It should be possible to load articles into the software from a file, see the attached inventory.json.
The warehouse software should also have products, products are made of different articles. Products should have a name, price and a list of articles of which they are made from with a quantity. The products should also be loaded from a file, see the attached products.json. 
 
The warehouse should have at least the following functionality;
* Get all products and quantity of each that is an available with the current inventory
* Remove(Sell) a product and update the inventory accordingly

The aplication port runs on port 8989, if you have any other application running on the same port please change server.port in application.properties, before launching the Spring Boot Application.

http://localhost:8989
Tack!
