package io.github.himanshuparashar0101.javadb.storage;

public class ArrayDb {

    private final String[] keys;
    private final String[] values;
    private int size;

    public ArrayDb(int capacity) {
        keys = new String[capacity];
        values = new String[capacity];
        size = 0;
    }

    public void put(String key, String value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }
}