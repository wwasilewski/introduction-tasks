package pl.sda.introductiontasks.tasks1;

/*
Wypisz na ekranie w jednej linii imie (znajdujące się w polu firstName) oraz nazwisko (wartość w polu lastName) referencji person.
 */
public class Task1_5 {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Adamski");
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.printf("%s%s", person.getFirstName(), person.getLastName());
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
