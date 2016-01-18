package Computers;

import javax.swing.event.MouseInputListener;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Mac extends Computer implements Keyboard{

    private String OSXName;

    public Mac(double screenSize, String OSXName){
        super(screenSize);
        this.OSXName = OSXName;
    }

    public String getOSXName(){
        return this.OSXName;
    }

    public void setOSXName(String newOSX){
        this.OSXName = newOSX;
    }

    @Override
    public double getScreenSize() {
        double size = super.getScreenSize();
        return size*1000;
    }

    public double getScreenSize(int multiplier) {
        return super.getScreenSize()*multiplier;
    }

    public void acceptInput(){
        // do something
    }

}
