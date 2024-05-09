# OOP-Complex-Engineering
3rd Sems OOP complex engineering assignment

# Introduction:

The following project presents a car showroom management system implemented in Java. The system allows users to manage and interact with a collection of cars within the showroom. Users can add, retrieve, and remove cars, as well as display the details of individual cars. The project utilizes object-oriented programming principles such as inheritance, method overriding, and method overloading to create a flexible and extensible system.

# Design:

![image](https://github.com/roschfield/OOP-Complex-Engineering/assets/69704777/d4858bff-0afc-4a20-9e17-9021a86c97e4)

# Features:

## MainCarShowroom:
Represents as the main driver class for the project.

## Car:
Represents a generic car class with attributes such as make, model, and year.This class serves as the parent class for specific types of cars.

## Sedan, SUV, SportsCar:
Subclasses of the Car class, representing different types of cars. Each subclass includes additional attributes specific to its type, such as number of seats for Sedans, four-wheel drive for SUVs, and top speed for Sports Cars.

## CarShowroom:
Manages a collection of cars in the showroom. It provides methods to add, retrieve, and remove cars, as well as display all cars in the showroom.

# Explanation:

## Classes and Inheritance:
The Car class serves as the parent class for specific types of cars. Each subclass (Sedan, SUV, SportsCar) inherits attributes and methods from the Car class. This allows for code reuse and facilitates polymorphic behavior.
Inheritance is utilized to model the relationship between different types of cars and their common attributes. For example, both Sedans and SUVs are types of cars and share common attributes such as make, model, and year.

## Methods, Overriding,, and Overloading:
The Car class includes a toString() method, overridden in each subclass to provide a string representation of the car object's details. This demonstrates method overriding, where a subclass provides a specific implementation of a method inherited from its superclass.
Method overloading is employes in the Sedan, SUV, and Sportscar classes for the toString() method. Each subclass overloads the method to include additional attributes specific to its type of car, such as number of seats, four-wheel drive, and top speed.

The CarShowroom class provides methods to add, retrieve, and remove cars from the showroom. It also includes a displayCars() method to display details of all cars in the showroom. These methods utilize the ArrayList data structure to manage the collection of cars efficiently.

## Retrieving a Car:
The program prompts the user to input the index of the car they want to retrieve from the showroom. The user enters the index via the console.
The program retrieves the car from the showroom based on the provided index using the retrieveCar() method of the CarShowroom class.
If the car is found at the specified index, its details are displayed to the user via the console. If the car is not found (i.e., the index is out of range), the program notifies the user that the car was not found in the showroom.

## Displaying All Cars:
The program iterates through the collection of cars stored in the showroom. For each car in the collection, the program retrieves its details using the toString() method, which provides a string representation of the car's attributes.
Finally, the program prints the index of the car in the showroom (starting from 1 for user-friendly display) followed by the car details.


# Output:

![image](https://github.com/roschfield/OOP-Complex-Engineering/assets/69704777/97ba42fc-62f7-451c-8f1b-a46fd4c1dad5)

