package org.example;

import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    @Override
    public String getEra() {
        return "Cenozoic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(
                new Mammoth(),
                new CaveLion(),
                new WoollyRhino()
        );
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(
                new Otodus(),
                new Whale()
        );
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(
                new Argentavis()
        );
    }

    // Concrete animal classes (land)
    static class Mammoth implements LandAnimal {
        public String getName() { return "Mammoth"; }
        public String getWalking() { return "stomping"; }
    }

    static class CaveLion implements LandAnimal {
        public String getName() { return "Cave lion"; }
        public String getWalking() { return "walking"; }
    }

    static class WoollyRhino implements LandAnimal {
        public String getName() { return "Woolly rhino"; }
        public String getWalking() { return "running"; }
    }

    // Concrete animal classes (sea)
    static class Otodus implements SeaAnimal {
        public String getName() { return "Otodus"; }
        public String getSwimming() { return "hunting"; }
    }

    static class Whale implements SeaAnimal {
        public String getName() { return "Whale"; }
        public String getSwimming() { return "swimming"; }
    }

    // Concrete animal classes (sky)
    static class Argentavis implements SkyAnimal {
        public String getName() { return "Argentavis"; }
        public String getFlying() { return "flapping"; }
    }
}
