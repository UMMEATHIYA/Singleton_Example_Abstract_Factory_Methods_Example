package org.example;

import java.util.Arrays;
import java.util.List;

public class JurassicAnimalFactory implements AnimalAbstractFactory {

    @Override
    public String getEra() {
        return "Jurassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Allosaurus(),
                new Stegosaurus()
        );
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Plesiosaurus(),
                new Ichthyosaurus()
        );
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Pterodactylus()
        );
    }

    // Concrete animal classes (land)
    static class Allosaurus implements LandAnimal {
        public String getName() { return "Allosaurus"; }
        public String getWalking() { return "stalking"; }
    }

    static class Stegosaurus implements LandAnimal {
        public String getName() { return "Stegosaurus"; }
        public String getWalking() { return "trudging"; }
    }

    // Concrete animal classes (sea)
    static class Plesiosaurus implements SeaAnimal {
        public String getName() { return "Plesiosaurus"; }
        public String getSwimming() { return "gliding"; }
    }

    static class Ichthyosaurus implements SeaAnimal {
        public String getName() { return "Ichthyosaurus"; }
        public String getSwimming() { return "darting"; }
    }

    // Concrete animal classes (sky)
    static class Pterodactylus implements SkyAnimal {
        public String getName() { return "Pterodactylus"; }
        public String getFlying() { return "soaring"; }
    }
}
