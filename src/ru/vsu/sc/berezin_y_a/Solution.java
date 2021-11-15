package ru.vsu.sc.berezin_y_a;

public class Solution {

    public int findCountOfSatisfyingElements(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double averageArithmetic = (double) sum / arr.length;
        int countOfNumbers = 0;
        double minDifference = 99999;
        if (arr.length == 0) {
            return 0;
        } else {
            for (double element : arr) {
                if (Math.abs(element - averageArithmetic) < minDifference) {
                    minDifference = Math.abs(element - averageArithmetic);
                    countOfNumbers = 1;
                } else if (Math.abs(element - averageArithmetic) == minDifference) {
                    countOfNumbers++;
                }
            }
            return countOfNumbers;
        }
    }

}
