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
        Computer c = new Mac(15.4, "Snow Leopard");
        Computer c2 = new PC(16, "Windows 10");
        Mac m = new Mac(12, "Yosemite");

        ArrayList<Computer> computers = new ArrayList<Computer>();
        computers.add(c);
        computers.add(c2);
        computers.add(m);

        for (Computer computer : computers) {
            System.out.println(computer.getScreenSize());
        }


        System.out.println(c.getScreenSize());
        System.out.println(m.getScreenSize(1000));
        System.out.println(c2.getScreenSize());

        m.getOSXName();
    }
}
