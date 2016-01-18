package Main;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class main {
    public static void main(String[] args){

        Dog fido = new Dog("Terrier", "Fido");
        fido.speak();
        System.out.println(fido.getName());
        System.out.println(Dog.defaultNumberOfLegs);
        System.out.println(Dog.getDefaultNumberOfLegs());


    }
}
