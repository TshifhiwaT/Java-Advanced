package Chapter9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExploreAssertions {

    static int num1, num2;
    @BeforeAll
    static void setup(){
        num1 = 5;
        num2 = 3;
    }

    @Test
    void testSumOfTwoNumbers(){
        int expected = 8;

        //Act - Actual
        int actual = num1 + num2;

        //Assert
        assertEquals(expected, actual, "The Sum of " + num1 + " + " + num2
                                + " is " + expected);
    }

    @Test
    void testDiffOfTwoNumbers(){
        //Arrange
        int expected = 2;

        int actual = num1- num2;

        assertTrue(expected == actual, "The difference of " + num1 + " - " + num2
                + " is " + expected);
    }

    @Test
    @DisplayName("Compute sum, difference and product")
    void testComputationOfTwoNumbers(){
        //Arrage
        int expectedSum = 8;
        int expectedDiff = 2;
        int expectedProd = 15;

        //Actual
        int actualSum = num1 + num2;
        int actualDiff = num1 - num2;
        int actualProd = num1 * num2;

        //assert
        assertAll(
                () -> assertEquals(expectedDiff, actualDiff),
                () -> assertEquals(expectedSum, actualSum),
                () -> assertEquals(expectedProd, actualProd)
        );
    }
}
