package ie.atu.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
        Calculator myResult;

        @BeforeEach
        void setUp() {
            myResult = new Calculator();
        }

        @Test
        void testAdd()
        {
            assertEquals(10, myResult.add(5,5));
        }
    @Test
    void testSubtract()
    {
        assertEquals(4, myResult.subtract(5,1));
    }
    @Test
    void testMultiply()
    {
        assertEquals(20, myResult.multiply(10,2));
    }
    @Test
    void testDivide()
    {
        assertEquals(1, myResult.divide(5,5));
    }

}
