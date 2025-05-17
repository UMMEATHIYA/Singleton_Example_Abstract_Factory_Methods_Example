package org.example;

import java.util.List;

public interface AnimalAbstractFactory {
    String getEra();
    List<LandAnimal> createLandAnimals();
    List<SeaAnimal> createSeaAnimals();
    List<SkyAnimal> createSkyAnimals();
}
