package Computers;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class PC extends Computer{
        private String windowsVersion;
    public PC(double screenSize, String windowsVersion){
        super(screenSize);
        this.windowsVersion = windowsVersion;
    }

    public String getWindowsVersion(){
        return this.windowsVersion;
    }
}
