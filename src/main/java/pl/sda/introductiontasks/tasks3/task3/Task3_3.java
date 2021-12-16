package pl.sda.introductiontasks.tasks3.task3;

/*
Stwórz interfejs Animal, który posiada jedną metodę bezargumentową makeSound,
która zwraca obiekt String.
Stwórz dwie klasy: Dog i Cat, które implementują interfejs Animal.
W metodzie main stwórz instancję klasy Dog i Cat, a następnie wywołaj dla każdego
z nich metodę makeSound.
 */

public class Task3_3 {
    public static void main(String[] args) {

        Animal dog = new Dog();
        System.out.println(dog.makeSound());

        Animal cat = new Cat();
        System.out.println(cat.makeSound());
    }
}

/*
TU UMIEŚĆ SWÓJ KOD
*/

interface Animal {
    String makeSound();
}

class Dog implements Animal {

    @Override
    public String makeSound() {
        return "hau-hau";
    }
}

class Cat implements Animal {

    @Override
    public String makeSound() {
        return "miauuuu";
    }
}
