package org.example;

public class EagerSingleton {
    private static final EagerSingleton[] instances = new EagerSingleton[3];

    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    private int id;

    private EagerSingleton(int id) {
        this.id = id;
    }

    public static EagerSingleton getInstance(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }
        return instances[i];
    }

    public int getId() {
        return id;
    }
}
