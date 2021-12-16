package pl.sda.introductiontasks.tasks3;

/*
Wywołaj metodę canThrow w metodzie main i obsłuż wyjątek.
 */
public class Task3_1 {
    public static void main(String[] args) {
        try {
            canThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void canThrow() throws Exception {
    }
}
