package Computers;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class PC extends Computer{
        // private field that will only be present in objects of type PC or a subclass of PC
        private String windowsVersion;

    // a constructor for PC that works just like the Mac constructor but uses windowsVersion instead of OSXName
    public PC(double screenSize, String windowsVersion){
        super(screenSize);
        this.windowsVersion = windowsVersion;
    }

    // works just like getOSXName in Mac
    public String getWindowsVersion(){
        return this.windowsVersion;
    }
}
