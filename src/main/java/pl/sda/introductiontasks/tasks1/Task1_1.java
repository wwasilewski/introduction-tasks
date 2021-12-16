package pl.sda.introductiontasks.tasks1;

/*
Create a variable named 'x' and initialize it with any integer.
In case 'x' is even, in the console print 'Is even', else print 'Is odd'.
 */

public class Task1_1 {
    public static void main(String[] args) {
        int x = 4;
        checkIfEvenOrOdd(x);
    }

    private static void checkIfEvenOrOdd(int x) {
        if (x % 2 == 0)
            System.out.println("Is even");
        else
            System.out.println("Is odd");
    }
}
