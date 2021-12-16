package pl.sda.introductiontasks.tasks4.task5;

import java.util.Arrays;

public class SimpleArrayExample<T> implements SimpleArray<T> {

    private T[] array;

    public SimpleArrayExample(int length) {
        array = (T[]) new Object[length];
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void put(int index, T value) {
        array[index] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        return "SimpleArrayExample{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
