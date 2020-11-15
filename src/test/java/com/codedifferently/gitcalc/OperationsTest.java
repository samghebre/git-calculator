package com.codedifferently.gitcalc;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {

    @Test
    public void testAdd() throws Exception {
        // Given
        int x = 1;
        int y = 1;

        //When
        int expected = 2;
        int actual = Operations.add(x, y);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSubtract() throws Exception {
        // Given
        int x = 1;
        int y = 1;

        //When
        int expected = 0;
        int actual = Operations.subtract(x, y);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMultiply() throws Exception {
        // Given
        int x = 2;
        int y = 2;

        //When
        int expected = 4;
        int actual = Operations.multiply(x, y);

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDivision() throws Exception {
        //Given
        double x = 6.0;
        double y = 2.0;

        //when
        double expected = 3.0;
        double actual = Operations.divide(x, y);
        //then

        Assert.assertEquals(expected, actual, 0.0);
    }
}
