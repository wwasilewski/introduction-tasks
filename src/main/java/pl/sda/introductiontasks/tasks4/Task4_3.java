package pl.sda.introductiontasks.tasks4;

/*
Odkomentuj i uzupełnij kod klas SimpleHi oraz ComplexHi,
aby w metodzie main zaprezentować działanie poliformizmu w javie.
 */

public class Task4_3 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        BaseHi simpleHi = new SimpleHi();
        simpleHi.sayHi();

        BaseHi complexHi = new ComplexHi();
        complexHi.sayHi();
    }
}

abstract class BaseHi {
    public abstract void sayHi();
}

// ODKOMENTUJ PONIŻSZY KOD
class SimpleHi extends BaseHi {

    @Override
    public void sayHi() {
        System.out.println("hello from SimpleHi class");
    }
}

class ComplexHi extends SimpleHi {

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("hello from ComplexHi class");
    }
}
