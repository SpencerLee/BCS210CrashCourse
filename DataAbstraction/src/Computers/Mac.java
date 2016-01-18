package Computers;

import javax.swing.event.MouseInputListener;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
// a Mac class with a superclass of Computer and which implements the Keyboard interface
public class Mac extends Computer implements Keyboard{
    // private field that will only be present in objects of type Mac or a subclass of Mac
    private String OSXName;

    // the constructor for a Mac object
    public Mac(double screenSize, String OSXName){
        // we call super(screenSize) to get the Computer superclass to set the screenSize field
        // we cannot set screenSize directly because it is private and subclasses cannot access private variables in
        // their superclass
        super(screenSize);
        // we can set OSXName ourselves here because it is not part of the superclass
        this.OSXName = OSXName;
    }

    // returns the private variable of OSXName without allowing external classes to access the field directly
    public String getOSXName(){

        return this.OSXName;
    }

    // sets the private variable of OSXName without allowing external classes to modify the field directly
    public void setOSXName(String newOSX){

        this.OSXName = newOSX;
    }

    // this method overrides the GetScreenSize() method in Computer and will be called instead of the Computer version
    // on any object with an actual type of Mac
    @Override
    public double getScreenSize() {
        double size = super.getScreenSize();
        return size*1000;
    }

    // an overloaded version of the getScreenSize() method
    public double getScreenSize(int multiplier) {

        return super.getScreenSize()*multiplier;
    }

    // this function must be implemented because Mac implements the Keyboard interface
    public void acceptInput(){
        // do something
    }

}
