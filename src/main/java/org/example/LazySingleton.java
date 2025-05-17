package org.example;

public class LazySingleton {
    private static final LazySingleton[] instances = new LazySingleton[3];
    private static final Object lock = new Object();

    private int id;

    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    public static LazySingleton getInstance(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2");
        }

        if (instances[i] == null) {
            synchronized (lock) {
                if (instances[i] == null) {
                    instances[i] = new LazySingleton(i);
                }
            }
        }

        return instances[i];
    }

    public int getId() {
        return id;
    }
}
