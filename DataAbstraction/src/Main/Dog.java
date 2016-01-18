package Main;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Dog {

    static int defaultNumberOfLegs = 4;

    public String name;
    public String breed;
    private int numberOfLegs;


    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.numberOfLegs = this.defaultNumberOfLegs;
    }

    public static int getDefaultNumberOfLegs(){
        return defaultNumberOfLegs;
    }

    public void speak(){
        System.out.println("Woof");
    }

    public String getName(){
        return this.name;
    }
}

