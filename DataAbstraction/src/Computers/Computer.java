package Computers;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
// define computer as an abstract class
// You cannot create an object of an abstract class but you can create objects of their subtypes
public abstract class Computer {
    // declare a private field for all Computers
    private double screenSize;

    // a constructor for an abstract class? we will call this using super(screenSize) in our subclass constructors in
    // order to set the value of the screenSize field since it cannot be accessed by subclasses
    public Computer (double screenSize) {
        this.screenSize = screenSize;
    }

    // a default implementation of getScreenSize(). This will be called when a subclass does not have an overriding method
    // for getScreenSize(). Notice the PC class does not override this method but the Mac class does
    public double getScreenSize(){

        return this.screenSize;
    }

}
