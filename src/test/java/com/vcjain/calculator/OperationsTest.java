package com.vcjain.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperationsTest {

        @Test(timeout=10000)
        public void testAdd()
        {
                Operations operations = new Operations();
                Integer actual = operations.add(2, 6);
                Integer expected = 8;
                assertEquals(expected, actual);
        }
}
