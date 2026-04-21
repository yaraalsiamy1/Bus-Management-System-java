/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusMS;

import java.util.Scanner;

/**
 *
 * @author Group 14
 */
public class BusMS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to our Bus management system ");
        int option=0;

        while(option>=0){
            System.out.println("");
            System.out.println("Select an option:");
            System.out.println("1.Passenger: ");
            System.out.println("2.Bus Driver ");
            System.out.println("3.To Exit  enter -1 \n");

            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    Passenger.selectPassenegr();
                    break;
                case 2:  
                    BusDriver.selectBusDriver();
                    break;                  
            }       
        }
        System.out.println(" See you next time ");
    }
}
