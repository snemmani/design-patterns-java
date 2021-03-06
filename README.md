# Design Patterns implementation in java

[![Build Status](https://travis-ci.org/snemmani/design-patterns-java.svg?branch=master)](https://travis-ci.org/snemmani/design-patterns-java) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=snemmani_design-patterns-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=snemmani_design-patterns-java)

## Creational Patterns Implemented
### Singleton
The singleton pattern is implemented as a DB Connection singleton in this project. It is designed to be thread safe.
#### What is Singleton Pattern?

Singleton pattern is one of the simplest design patterns in Java. 
This type of design pattern comes under creational pattern as this 
pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
.
.
.

## Structural Patterns Implemented
### Composite
The composite pattern is implemented as a Menu, to further add sub Menus and manage them
#### What is composite pattern?
It generalizes a hierarchical structure. It helps in simplifying things too much and makes it easier for clients.
### Decorator
The decorator pattern is implemented as a Sandwich that contains Decorators to add condiments + sidings
#### What is a Decorator pattern?
Decorator pattern contains another entity while modifying the behaviour of the entity it involves.
It doesn't change the underlying object.
### Facade (Pronounced as F-A-S-A-A-D)
Facade pattern is implemented as a Dummy JDBC Connector
#### What is a Facade pattern
Facade pattern simplifies the client interface. To make things easier and cleanup code.
***More content to come***
