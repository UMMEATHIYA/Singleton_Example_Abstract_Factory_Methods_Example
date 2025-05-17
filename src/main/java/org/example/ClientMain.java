package org.example;

public class ClientMain {
    public static void main(String[] args) {
        // Retrieve instances of EagerSingleton with IDs 0, 1, and 2
        EagerSingleton s1 = EagerSingleton.getInstance(0);
        System.out.println("Retrieved eager singleton " + s1.getId());

        EagerSingleton s2 = EagerSingleton.getInstance(1);
        System.out.println("Retrieved eager singleton " + s2.getId());

        EagerSingleton s3 = EagerSingleton.getInstance(2);
        System.out.println("Retrieved eager singleton " + s3.getId());

        EagerSingleton s4 = EagerSingleton.getInstance(0);
        System.out.println("Retrieved eager singleton " + s4.getId());

        // Retrieve instances of LazySingleton with IDs 0, 1, and 2
        LazySingleton ls1 = LazySingleton.getInstance(0);
        System.out.println("Retrieved lazy singleton " + ls1.getId());

        LazySingleton ls2 = LazySingleton.getInstance(1);
        System.out.println("Retrieved lazy singleton " + ls2.getId());

        LazySingleton ls3 = LazySingleton.getInstance(2);
        System.out.println("Retrieved lazy singleton " + ls3.getId());

        LazySingleton ls4 = LazySingleton.getInstance(0);
        System.out.println("Retrieved lazy singleton " + ls4.getId());
    }
}
