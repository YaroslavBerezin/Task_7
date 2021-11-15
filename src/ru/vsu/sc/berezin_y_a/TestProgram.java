package ru.vsu.sc.berezin_y_a;

public class TestProgram {

    TestCase testCase = new TestCase();
    Solution solution = new Solution();

    public boolean test() {
        if (solution.findCountOfSatisfyingElements(testCase.arr1) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr2) != 2) {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr3) != 2) {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr4) != 3) {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr5) != 4) {
            System.out.println("Test 5 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr6) != 2) {
            System.out.println("Test 6 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr7) != 1) {
            System.out.println("Test 7 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr8) != 1) {
            System.out.println("Test 8 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr9) != 1) {
            System.out.println("Test 9 is not completed");
            return false;
        } else if (solution.findCountOfSatisfyingElements(testCase.arr10) != 2) {
            System.out.println("Test 10 is not completed");
            return false;
        } else {
            return true;
        }
    }

}
