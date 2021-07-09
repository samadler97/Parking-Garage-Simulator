# Parking Garage Project

# Description
This project is a parking garage that I developed. This program will help the user park as many vehicles as they wish into a four-hundred space parking garage. 
The garage consists of four floors, with one-hundred spaces per floor. To create this, I used a two dimensional array, and set the rows as the floors and the 
columns as the spaces. To represent each space, I used the letter “O” to represent an open space, and the type of vehicle parked in a space to show if that space 
is already taken. I also included a condition which will not allow a space to be overwritten by another car being parked there. Rather, if a space is taken, 
the user will have to park their car in a separate location.

# Instructions
To properly use this program, the user will need to load both the Main.java file as well as the Vehicle.java file. The Main class contains the method for printing 
the parking garage so the user can see what spaces are available, and also contains the method for parking each vehicle in a space. The Vehicle class contains the 
constructor for the vehicle, which is the object type parked in each space in the parking garage, as well as the getters and setters for the vehicle. The vehicle 
also takes two arguments. The first is a boolean value which represents whether or not a vehicle is in a spot (true for yes, false for no) and the type of vehicle 
(either a car, truck, or bus).

# Sample Input
The input and output is more or less self-explanatory. In other words, if I were to input that I wanted to park a vehicle on the third floor in space forty-two, 
then on the grid that prints out after the parking method has completed, you would see a space filled in with whatever vehicle type I decided to input. So again, 
if I inputted a vehicle at floor three and space forty-two and I said this vehicle was a “Truck”, then in row three, under the column forty-two, it would say 
“Truck”, and all the rest of the surrounding area would still show “O”.

