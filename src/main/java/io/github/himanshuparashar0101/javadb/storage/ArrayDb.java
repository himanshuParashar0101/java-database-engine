package io.github.himanshuparashar0101.javadb.storage;

public class ArrayDb {

    private final String[] keys;
    private final String[] values;

    public ArrayDb(int capacity) {
        keys = new String[capacity];
        values = new String[capacity];
    }
}