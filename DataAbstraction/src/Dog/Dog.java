package Dog;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Dog {

    // class variable for all Dogs
    static int defaultNumberOfLegs = 4;

    // fields for each instance of Dog
    public String name;
    public String breed;
    private int numberOfLegs;


    // constructor for objects of type Dog
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.numberOfLegs = this.defaultNumberOfLegs;
    }

    // class method that returns the class variable defaultNumberOfLegs
    public static int getDefaultNumberOfLegs(){
        return defaultNumberOfLegs;
    }

    // method that prints "Woof"
    public void speak(){
        System.out.println("Woof");
    }
    // method that returns the name field of the Dog object that called it
    public String getName(){
        return this.name;
    }
}

