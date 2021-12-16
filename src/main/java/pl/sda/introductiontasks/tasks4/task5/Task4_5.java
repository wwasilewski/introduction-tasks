package pl.sda.introductiontasks.tasks4.task5;

/*
Stwórz generyczną klasę SimpleArrayExample, która implementuje interfejs SimpleArray.
Jej podstawą powinna być tablica dowolnego typu, której rozmiar definiujemy w jedynym,
jednoargumentowym konstruktorze.
W metodzie main zaprezentuj działanie stworzonej implementacji.
 */
public class Task4_5 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        SimpleArrayExample<Integer> arrayOfIntegers = new SimpleArrayExample<>(5);
        System.out.println("size: " + arrayOfIntegers.size());
        arrayOfIntegers.put(1, 7);
        arrayOfIntegers.put(2, 3);
        System.out.println(arrayOfIntegers.get(2));
        System.out.println(arrayOfIntegers);

        SimpleArrayExample<Double> arrayOfDoubles = new SimpleArrayExample<>(4);
        System.out.println("size: " + arrayOfDoubles.size());
        arrayOfDoubles.put(1, 3.4);
        arrayOfDoubles.put(0, 6.1);
        System.out.println(arrayOfDoubles.get(1));
        System.out.println(arrayOfDoubles);
    }
}

interface SimpleArray<T> {
    T get(int index);

    void put(int index, T value);

    int size();
}
