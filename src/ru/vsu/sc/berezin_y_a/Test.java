package ru.vsu.sc.berezin_y_a;

public class Test {

    int[] arr1 = {1, 2, 2};
    int[] arr2 = {5, 5, 10};
    int[] arr3 = {10, 20, 30, 40};
    int[] arr4 = {10, 10, 10};
    int[] arr5 = {4, 4, 4, 4};
    int[] arr6 = {1, 2};
    int[] arr7 = {1, 1, 20, 100};
    int[] arr8 = {1};
    int[] arr9 = {2, 22, 222};
    int[] arr10 = {100, 10000, 100};

    public boolean testProgram() {
        if (Main.solution(arr1) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr2) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr3) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr4) != 3) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr5) != 4) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr6) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr7) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr8) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr9) != 1) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (Main.solution(arr10) != 2) {
            System.out.println("Test 1 is not completed");
            return false;
        } else {
            return true;
        }
    }

}
