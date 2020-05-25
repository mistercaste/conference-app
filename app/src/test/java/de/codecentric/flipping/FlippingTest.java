package de.codecentric.flipping;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class FlippingTest {

    @Test
    public void testFlipping() throws Exception {

        Random random = new Random();

        // Generate random integers in range 0 to 99
        int randomInt = random.nextInt(100);

        // 75% possibility to succeed
        assertThat("Random flipping int", randomInt, greaterThan(25));
    }

}
