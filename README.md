Vehicle Management System

## A Project Overview

this project demonstrates basic Object Oriented Programming concepts in Java
the purpose of the Vehicle Management System is to show how inheritance abstraction composition and aggregation work together.

the system uses an abstract Vehicle class that represents common vehicle behavior.  
car Motorcycle and Truck classes inherit from Vehicle and implement their own engine behavior.  
each vehicle is connected to a Driver object. One driver can be assigned to multiple vehicles.

## B Class Hierarchy

Vehicle is an abstract superclass that contains common fields and methods 

Car Motorcycle and Truck are subclasses that extend Vehicle.

the methods startEngine and stopEngine are overridden in each subclass to provide different behavior.

protected access is used in the superclass to allow subclasses to access shared fields.
private access is used in subclasses to protect specific details.

## C Instructions to Compile and Run

Run the program using  
java Main

## D Screenshots

Screenshots show the program output and located in depository called 'screenshots'

## E Reflection

Inheritance simplified the program design by reducing repeated code and allowing shared logic in one place.  
method overriding helped customize behavior for different vehicle types while keeping a common structure.

Using protected access modifiers was challenging because it required careful design to avoid breaking encapsulation while still allowing subclasses to work correctly
