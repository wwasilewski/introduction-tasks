package pl.sda.introductiontasks.tasks2;

/*
Create an array of length 10 and initialize with any integers.
Calculate sum of all numbers in this array and print it in the console.
 */

public class Task2_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumArray(numbers));
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
