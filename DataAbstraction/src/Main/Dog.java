package Main;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class Dog {

    private String breed;

    private String name;

    public Dog(String breed, String name){
        // this executes when creating a new object of type Main.Dog
        this.breed = breed;
        this.name = name;
    }

    public void speak(){
        System.out.println("Woof");
    }

    public void printName(){
        System.out.println(this.name);
    }

    public String getName(){
        return this.name;
    }

}

