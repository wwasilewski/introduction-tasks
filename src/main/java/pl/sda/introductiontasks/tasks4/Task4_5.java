package pl.sda.introductiontasks.tasks4;

/*
Stwórz generyczną klasę SimpleArrayExample, która implementuje interfejs SimpleArray. Jej podstawą powinna być tablica dowolnego typu, której rozmiar definiujemy w jedynym, jednoargumentowym konstruktorze.
W metodzie main zaprezentuj działanie stworzonej implementacji.
 */
public class Task4_5 {
  public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
  }
}

interface SimpleArray<T> {
  T get(int index);
  void put(int index, T value);
  int size();
}