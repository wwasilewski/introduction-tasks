package pl.sda.introductiontasks.tasks2.task5;

/*
Stwórz klasę, która reprezentuje zwierzę.
Każde zwierze posiada imię, liczbę nóg, typ (np. 'pies', 'kot').
Ponadto, klasa ta posiada metodę, która opisuje zwierzę,
wyświetlając odpowiednie informacje na ekranie.
Stwórz instancję takiej klasy w metodzie main i wywołaj wyżej opisaną metodę.
 */
public class Task2_5 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Reksio", 4, "dog");
        System.out.println(animal1.describeAnimal());
    }
}
