package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Spencer Lee on 2016-01-17.
 */
public class DogTest {
    Dog testDog;
    @Before
    public  void setUp() throws Exception {
        testDog = new Dog("Terrier", "Fido");
        System.out.println("Before Class");
    }

    @Test
    public void testGetNumberOfLegs() throws Exception {
        assertEquals(Dog.getDefaultNumberOfLegs(), 4);
    }

    @Test
    public void testSpeak() throws Exception {

    }
}