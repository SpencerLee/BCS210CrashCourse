package Computers;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public abstract class Computer {
    private double screenSize;

    public Computer () {
    }

    public Computer(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getScreenSize(){
        return this.screenSize;
    }

}
