package ru.vsu.sc.berezin_y_a;

public class TestProgram {

    TestCase testCase = new TestCase();

    public boolean test() {
        if (Main.findCountOfSatisfyingElements(testCase.arr1) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr2) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr3) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr4) != 3) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr5) != 4) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr6) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr7) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr8) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr9) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.findCountOfSatisfyingElements(testCase.arr10) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else {
            return true;
        }
    }

}
