package DogTest;

import static org.junit.Assert.assertEquals;

// we have to import Dog.* because the class Dog is in a different package
import Dog.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class DogTest {
    // create a Dog variable for testing called testDog
    Dog testDog;

    // run this before every test runs
    @Before
    public  void setUp() throws Exception {
        testDog = new Dog("Terrier", "Fido");
        System.out.println("Before Class");
    }

    // test that the class variable is correctly set and has not been changed
    @Test
    public void testGetNumberOfLegs() throws Exception {
        assertEquals(Dog.getDefaultNumberOfLegs(), 4);
    }

    // testing that the getName function is returning the name of the object that called it
    @Test
    public void testSpeak() throws Exception {
        Dog testDog2 = new Dog("Spaniel", "Rex");
        assertEquals(testDog.getName(), "Fido");
        assertEquals(testDog2.getName(), "Rex");

    }
}