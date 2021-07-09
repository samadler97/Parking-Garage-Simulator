package com.company;

/** Parking Garage
 *  This program will allow the user
 *  to park as many vehicles as they
 *  desire in a parking garage with
 *  four floors, and one-hundred
 *  spaces per floor.
 *  @author Sam Adler
 *  @version 1.0
 */

import java.util.*;

public class Main {

    public static Vehicle[][] garage = new Vehicle[4][100];

    public static void main(String[] args) {

        int row;
        int col;
        String YorN;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to Sam's Parking Garage!");
        System.out.println("Below is all the spaces in the parking garage.");
        System.out.println("Available spaces are marked with an " + "O" + ", and taken spaces will show the type of vehicle in that space.");

        for (row = 0; row < 4; ++row) {
            for (col = 0; col < 100; ++col) {
                garage[row][col] = new Vehicle(false, "empty");
            }
        }

        System.out.println();
        print();
        System.out.println();

        System.out.println("Do you want to park a vehicle? ");
        YorN = stdin.next();

        while (YorN.equals("Y") || YorN.equals("y") || YorN.equals("Yes") || YorN.equals("yes")) {
            parking();
            print();
            System.out.println("Do you want to park another vehicle? ");
            YorN = stdin.next();
        }
    }

    /**
     * Method will print out the layout of the
     * parking garage originally, with no spaces
     * taken, and after the user parks a vehicle,
     * with open spaces shown by "O" and taken
     * spaces shown by the vehicle type.
     * @param "None"
     * @return void
     */

    public static void print() {

        int row;
        int col;

        System.out.print("  ");

        for (int i = 1; i <= 100; ++i) {
            System.out.printf("%6d", i);
        }

        System.out.println();

        for (row = 0; row < 4; ++row) {
            System.out.print((row + 1) + " ");
            for (col = 0; col < 100; ++col) {
                if (garage[row][col].getTaken()) {
                    System.out.printf("%6s", garage[row][col].getType());
                }
                else {
                    System.out.printf("%6s", "O");
                }

            }
            System.out.println();
        }
    }

    /**
     * Method will prompt the user to park
     * a vehicle, and will ask them where
     * they wish to park it and what type
     * of vehicle they will be parking
     * @param "None"
     * @return void
     */

    public static void parking() {

        int floor;
        int space;
        Scanner stdin = new Scanner(System.in);

        try{

            System.out.println("Please enter the type of vehicle you want to park (Car, Truck, or Bus): ");
            Vehicle vehicle = new Vehicle(true, stdin.next());
            System.out.println("What floor do you want to park the vehicle on? ");
            floor = stdin.nextInt();
            floor = floor - 1;
            System.out.println("What space do you want to park the vehicle in? ");
            space = stdin.nextInt();
            space = space - 1;

            while (garage[floor][space].getTaken()) {
                System.out.println("This space is unavailable. Please select a different space.");
                System.out.println("What floor do you want to park the vehicle on? ");
                floor = stdin.nextInt();
                System.out.println("What space do you want to park the vehicle in? ");
                space = stdin.nextInt();
            }

            garage[floor][space] = vehicle;

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("This is not a viable parking space.");

        }
    }
}

