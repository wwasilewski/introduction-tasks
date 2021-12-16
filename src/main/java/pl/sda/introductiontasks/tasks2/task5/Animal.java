package pl.sda.introductiontasks.tasks2.task5;

public class Animal {
    private String name;
    private int numberOfLegs;
    private String type;

    public Animal(String name, int numberOfLegs, String type) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    public String describeAnimal() {
        return "Animal{" +
                "name=" + name +
                ", numberOfLegs=" + numberOfLegs +
                ", type=" + type +
                '}';
    }
}
