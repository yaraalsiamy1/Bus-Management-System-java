/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusMS;

/**
 *
 * @author Group14
 */
public class Bus {

    //static variables that will check if a specific bus have a booking made by a passenger or not
    public static boolean check1 = false;
    public static boolean check2 = false;
    public static boolean check3 = false;
    public static boolean check4 = false;
   

    //no arg Counstructor
    public Bus() {
    }

    //a method that have an array of objects(bus1) that will save every booking made by passengers in this bus
    public static Bus[] Bus1() {
        Bus[] bus1 = new Bus[20];
        int i = 0;
        bus1[i] = new Bus();
        ++i;
        //if statment to make sure that a booking is already made and that the bus is not empty
        if (bus1[0] != null) {
            check1 = true;
        }
        return bus1;
    }

    //a method that have an array of objects(bus2) that will save every booking made by passengers in this bus
    public static Bus[] Bus2() {
        Bus[] bus2 = new Bus[20];
        int i = 0;
        bus2[i] = new Bus();
        ++i;
        //if statment to make sure that a booking is already made and that the bus is not empty
        if (bus2[0] != null) {
            check2 = true;
        }
        return bus2;
    }

    //a method that have an array of objects(bus3) that will save every booking made by passengers in this bus
    public static Bus[] Bus3() {
        Bus[] bus3 = new Bus[20];
        int i = 0;
        bus3[i] = new Bus();
        ++i;
        // if statment to make sure that a booking is already made and that the bus is not empty
        if (bus3[0] != null) {
            check3 = true;
        }
        return bus3;
    }

    //a method that have an array of objects(bus4) that will save every booking made by passengers in this bus
    public static Bus[] Bus4() {
        Bus[] bus4 = new Bus[20];
        int i = 0;
        bus4[i] = new Bus();
        ++i;
        // if statment to make sure that a booking is already made and that the bus is not empty
        if (bus4[0] != null) {
            check4 = true;
        }
        return bus4;
    }

    

}
