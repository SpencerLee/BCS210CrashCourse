package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Main.*;

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
    public void testGetName() throws Exception {
        assertEquals(.defaultNumberOfLegs, 4);

    }
}