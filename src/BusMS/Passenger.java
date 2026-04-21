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

public class Passenger extends User {

    private static Passenger[] passengerList = new Passenger[0];

    //Constructor
    public Passenger(String name, String userld, String email, String password) {
        super(name, userld, email, password);
    }

    public static void selectPassenegr() {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Select an option:");
            System.out.println("1. Add a new Passenger");
            System.out.println("2. Book a ticket");
            System.out.println("3. Rating");
            System.out.println("4. to go back to the main page...\n");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Passenger.addPassenger();
                    break;
                case 2:
                    Passenger.BookTicket();
                    break;
                case 3:
                    Passenger.Rating();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option, "
                            + " Please enter a number between 1 and 4.");
                    break;
            }
            break;
        }
    }

    // Method to add a new passenger to the list
    public static void addPassenger() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter user ID: ");
        String userld = input.nextLine();
        System.out.println("Enter your email: ");
        String email = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        Passenger newPassenger = new Passenger(name, userld, email, password);

        Passenger[] newPassengerList = new Passenger[passengerList.length + 1];
        for (int i = 0; i < passengerList.length; i++) {
            newPassengerList[i] = passengerList[i];
        }
        newPassengerList[newPassengerList.length - 1] = newPassenger;
        passengerList = newPassengerList;

        System.out.println("New passenger added successfully.\n");
    }

    //Method to create a new booking
    public static void BookTicket() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your departure Time:");
        System.out.println("1. 6:00 AM");
        System.out.println("2. 8:00 AM");
        System.out.println("3. 10:00 AM");
        System.out.println("4. 12:00 PM");
       

        //Departure time
        int Dtime = input.nextInt();
        input.nextLine();

        //printing the suitable message based on what time the passenger wants the trip
        switch (Dtime) {
            case 1:
                Bus.Bus1();
                System.out.println(" Your reservation at 6:00 AM is confirmed, bus No.1 is going to be there for you");
                break;
            case 2:
                Bus.Bus2();
                System.out.println(" Your reservation at 8:00 AM is confirmed, bus No.2 is going to be there for you ");
                break;
            case 3:
                Bus.Bus3();
                System.out.println(" Your reservation at 10:00 AM is confirmed, bus No.3 is going to be there for you ");
                break;
            case 4:
                Bus.Bus4();
                System.out.println(" Your reservation at 12:00 PM is confirmed, bus No.4 is going to be there for you ");
                break;
            
            default:
                System.out.println(" Invalid option, "
                        + " Please enter a number between 1 and 4. ");
                break;

        }
         if(Dtime>=1 & Dtime<=4 ){
            System.out.println(" Please arrive at the bus stop 10 minutes before departure time. ");

         }

    }

    //Method to create a new Feedback
    public static void Rating() {
        Scanner input = new Scanner(System.in);

        System.out.println("How was your trip?, we would love to hear from you!");
        System.out.println("Type your feedback");
        String Feedback = input.nextLine();
        System.out.println("Rate your trip out of 5: ");
        int rate = input.nextInt();
        System.out.println("Dear customer, thank you for your trust..your feedback is always appreciated.");

    }

}
