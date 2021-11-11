package ru.vsu.sc.berezin_y_a;

public class Tests {

    TestCase testCase = new TestCase();

    public boolean testProgram() {
        if (Main.solution(testCase.arr1) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr2) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr3) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr4) != 3) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr5) != 4) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr6) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr7) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr8) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr9) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(testCase.arr10) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else {
            return true;
        }
    }

}
