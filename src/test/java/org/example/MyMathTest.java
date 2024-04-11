package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    @Test
    public void testCalculateSum() {
        int[] numbers = {1,4,7};

        MyMath myMath = new MyMath();
        int result = myMath.calculateSum(numbers);
        int expectedResult = 12;
        assertEquals(expectedResult, result);
    }
}
