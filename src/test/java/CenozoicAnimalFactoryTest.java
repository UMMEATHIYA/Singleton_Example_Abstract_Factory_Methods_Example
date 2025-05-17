import org.example.AnimalAbstractFactory;
import org.example.CenozoicAnimalFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CenozoicAnimalFactoryTest {

    @Test
    public void testCreateLandAnimals() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        var landAnimals = factory.createLandAnimals();
        assertFalse(landAnimals.isEmpty(), "Land animals list should not be empty");
        assertEquals("Mammoth", landAnimals.get(0).getName());
        // Add more assertions about walking behavior etc.
    }

    @Test
    public void testEra() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        assertEquals("Cenozoic", factory.getEra());
    }
}
