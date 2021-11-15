package ru.vsu.sc.berezin_y_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TestProgram testProgram = new TestProgram();
        Solution solution = new Solution();

        if (!testProgram.test()) {
            System.out.println("Test error");
            return;
        } else {
            System.out.println("All tests completed");
        }

        System.out.println(" ");

        int[] array = new int[readLengthOfArray()];
        readArray(array);

        System.out.print("Answer: ");
        System.out.println(solution.findCountOfSatisfyingElements(array));

    }

    private static int readLengthOfArray() {
        System.out.println("Filling the array");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        return scanner.nextInt();
    }

    private static void readArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d element of array: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
    }

}
