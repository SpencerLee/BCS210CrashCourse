package Computers;

import Computers.Computer;
import Computers.Mac;
import Computers.PC;

import java.util.ArrayList;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Main {
    public static void main(String[] args){
        // we can create variables with the apparent type of Computer but an actual type of a subtype of Computer like Mac
        // or PC
        Computer c = new Mac(15.4, "Snow Leopard");
        Computer c2 = new PC(16, "Windows 10");

        // we can also create objects with an apparent type of a subclass of Computer
        Mac m = new Mac(12, "Yosemite");

        // we can add our computer variables to an ArrayList of Computers
        // note that the elements of the ArrayList maintain their actual types when accessed
        ArrayList<Computer> computers = new ArrayList<Computer>();
        computers.add(c);
        computers.add(c2);
        computers.add(m);

        // we use a special for each loop that only works on ArrayLists to iterate over every element in computers
        // for each computer in computers print the screen size of the computer
        for (Computer computer : computers) {
            System.out.println(computer.getScreenSize());
        }

        // printing the screen size of c, notice that it will output the result of the getScreenSize() method in the Mac class
        System.out.println(c.getScreenSize());
        // printing the screen size of m using the overridden method getScreenSize()
        System.out.println(m.getScreenSize());
        // printing the screen size of m using an overloaded method that takes a multiplier as a parameter
        System.out.println(m.getScreenSize(500));
        // printing the screen size of c2 using the getScreenSize() method in the Computer class because PC does not have it overridden
        System.out.println(c2.getScreenSize());

        // using the getOSXName() method to print the OSX name of m. Note this will not work if m is declared as Computer m = ...
        System.out.println(m.getOSXName());
    }
}
