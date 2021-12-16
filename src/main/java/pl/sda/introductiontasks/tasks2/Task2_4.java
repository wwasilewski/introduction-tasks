package pl.sda.introductiontasks.tasks2;

/*
Stwórz enum, który posiada cztery możliwe wartości: ADD, MULTIPLY, SUBTRACT, DIVIDE
Stwórz metodę, która przyjmuje trzy argumenty: dwie liczby zmiennoprzecinkowe
oraz wartość wyżej stworzonego enuma.
Wykorzystując 'switch', zwróć wynik dla wejściowych liczb zależny od typu operacji.
 */
public class Task2_4 {
    public static void main(String[] args) {
        System.out.println(count(3, 2, MathOperation.MULTIPLY));
        System.out.println(count(3, 2, MathOperation.ADD));
        System.out.println(count(3, 0, MathOperation.DIVIDE));
        System.out.println(count(3, 2, MathOperation.SUBTRACT));
    }

    public enum MathOperation {
        ADD, MULTIPLY, SUBTRACT, DIVIDE
    }

    public static double count(float number1, float number2, MathOperation operation) {
        double result = 0;
        switch (operation) {
            case ADD -> result = number1 + number2;
            case MULTIPLY -> result = number1 * number2;
            case SUBTRACT -> result = number1 - number2;
            case DIVIDE -> result = number1 / number2;
        }
        return result;
    }
}
