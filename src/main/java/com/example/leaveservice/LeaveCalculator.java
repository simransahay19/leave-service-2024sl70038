
package com.example.leaveservice;

public class LeaveCalculator {

    // Calculate remaining leave balance
    public int calculateLeaveBalance(int totalLeaves, int usedLeaves) {

        if (totalLeaves < 0 || usedLeaves < 0) {
            throw new IllegalArgumentException(
                "Leave values cannot be negative"
            );
        }

        if (usedLeaves > totalLeaves) {
            throw new IllegalArgumentException(
                "Used leaves cannot exceed total leaves"
            );
        }

        return totalLeaves - usedLeaves;
    }

    // Calculate leave encashment amount
    public double calculateLeaveEncashment(
            int encashableLeaves, double dailySalary) {

        if (encashableLeaves < 0 || dailySalary < 0) {
            throw new IllegalArgumentException(
                "Values cannot be negative"
            );
        }

        return encashableLeaves * dailySalary;
    }
}

