package pl.sda.introductiontasks.tasks4.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Stwórz pulę wątków o wielkości 2. Wykorzystując ją, uruchom 3 wątki,
których jedynym zadaniem jest wypisanie na ekran dowolnego tekstu.
 */
public class Task4_1 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        ExecutorService es = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 3; i++) {
            es.execute(new Task4_1_Runnable());
        }
        es.shutdown();
    }
}
