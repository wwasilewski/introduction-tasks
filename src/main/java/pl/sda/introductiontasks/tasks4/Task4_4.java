package pl.sda.introductiontasks.tasks4;

/*
Uzupełnij kod klasy SingletonExample w taki sposób, aby reprezentował singleton.
W metodzie main stwórz dwie referencje obiektu SingletonExample i wykaż, że są takie same.
 */
public class Task4_4 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        System.out.println(singletonExample1);

        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample2);
    }
}

class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
