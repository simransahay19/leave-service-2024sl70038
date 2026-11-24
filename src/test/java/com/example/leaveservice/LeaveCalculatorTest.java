
package com.example.leaveservice;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeaveCalculatorTest {

    LeaveCalculator calculator = new LeaveCalculator();

    // Test 1: Calculate remaining leave balance
    @Test
    public void testLeaveBalance() {

        int result = calculator.calculateLeaveBalance(20, 5);

        assertEquals(15, result);
    }

    // Test 2: Calculate leave encashment
    @Test
    public void testLeaveEncashment() {

        double result = calculator.calculateLeaveEncashment(10, 1000);

        assertEquals(10000.0, result, 0.01);
    }

    // Test 3: Invalid leave input should throw exception
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLeaveBalance() {

        calculator.calculateLeaveBalance(15, 20);
    }
}
