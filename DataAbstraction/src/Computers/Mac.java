package Computers;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Mac extends Computer {

    private String OSXName;

    public Mac(double screenSize, String OSXName){
        super(screenSize);
        this.OSXName = OSXName;
    }

    public String getOSXName(){
        return this.OSXName;
    }
}
