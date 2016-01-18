package Dog;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class main {
    public static void main(String[] args){

        // create a new Dog named Fido that is a Terrier
        Dog fido = new Dog("Terrier", "Fido");
        // create a different new Dog named Rex that is a Poodle
        Dog rex = new Dog("Poodle", "Rex");

        // make Fido speak -> prints "Woof"
        fido.speak();
        // make Rex speak -> also prints "Woof"
        rex.speak();

        // print the result of getName on Fido -> Fido
        System.out.println(fido.getName());
        // print the result of getName on Rex -> Rex
        System.out.println(rex.getName());

        // prints the class variable defaultNumberOfLegs for the Dog class
        System.out.println(Dog.defaultNumberOfLegs);
        // prints the result of calling the static method getDefaultNumberOfLegs from the Dog class
        System.out.println(Dog.getDefaultNumberOfLegs());


    }
}
