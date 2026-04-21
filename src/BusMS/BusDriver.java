/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusMS;

/**
 *
 * @author Group14
 */
import java.util.Scanner;

public class BusDriver extends User {

    //an array variable declariation of type BusDriver
    private static BusDriver[] busDriverList = new BusDriver[0];

    //Constructor
    public BusDriver(String name, String userld, String email, String password) {
        super(name, userld, email, password);
    }

    //a method to get the driver's info
    public static void selectBusDriver() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter user ID: ");
        String userld = input.nextLine();
        System.out.println("Enter your email: ");
        String email = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        //object declariation of type BusDriver
        BusDriver newBusDriver = new BusDriver(name, userld, email, password);

        //a new array that copies all the objets from the original array to allow the addition of new objects
        BusDriver[] newBusDriverList = new BusDriver[busDriverList.length + 1];
        for (int i = 0; i < busDriverList.length; i++) {
            newBusDriverList[i] = busDriverList[i];
        }
        newBusDriverList[newBusDriverList.length - 1] = newBusDriver;
        busDriverList = newBusDriverList;

        System.out.println("Bus Driver added successfully.\n");

        //printing the suitable message based on what time the passenger wants the trip
        if (Bus.check1 == true) {

            System.out.println("Head to the bus stops to transport passengers to al-Haram ");
            System.out.println(" The passengers are waiting for you \n"
                    + " At 6:00 AM ");
            System.out.println("Your bus number is 1, Don't be late ");

        }
        if (Bus.check2 == true) {
            System.out.println("Head to the bus stops to transport passengers to al-Haram ");
            System.out.println(" The passengers are waiting for you \n"
                    + " At 8:00 AM ");
            System.out.println("Your bus number is 2, Don't be late ");

        }
        if (Bus.check3 == true) {
            System.out.println("Head to the bus stops to transport passengers to al-Haram ");
            System.out.println(" The passengers are waiting for you \n"
                    + " At 10:00 AM ");
            System.out.println("Your bus number is 3, Don't be late ");

        }
        if (Bus.check4 == true) {
            System.out.println("Head to the bus stops to transport passengers to al-Haram ");
            System.out.println(" The passengers are waiting for you \n"
                    + " At 12:00 PM ");
            System.out.println("Your bus number is 4, Don't be late ");

        }else {
            System.out.println(" Thank you, but we don't need your service right now");
        }

    }
}
