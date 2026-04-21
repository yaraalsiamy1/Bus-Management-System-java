# Bus Management System

A console-based Bus Management System developed in Java as part of a Programming 2 project.  
The system provides basic functionality for managing passengers, bus drivers, and bus ticket reservations through a menu-driven interface.


## Project Overview

This project simulates a simple bus management environment where users can interact with the system through the command line.

The application starts with a main menu that allows the user to choose between:
- Passenger
- Bus Driver
- Exit

The passenger module supports:
- Adding a new passenger
- Booking a ticket
- Submitting trip feedback and rating

The booking process allows passengers to select from available departure times, and the system confirms the reservation with the assigned bus.


## Features

- Menu-based console interface
- Add and store passenger information
- Add bus driver information
- Book bus tickets based on departure time
- Assign reservations to available buses
- Collect passenger feedback and ratings
- Object-oriented design using separate classes


## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- NetBeans



## Project Structure

```text
src/
└── BusMS/
    ├── BusMS.java
    ├── Bus.java
    ├── BusDriver.java
    ├── Passenger.java
    └── User.java
