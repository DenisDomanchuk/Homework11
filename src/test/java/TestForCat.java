import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForCat {
    @Test
    void equalsCatForSpecies() {
        Cat cat = new Cat("brown", 4000, "persian", "Jerry");
        Cat cat1 = new Cat("white", 40, "bengal", "Tom");
        Assertions.assertEquals(cat, cat1);
    }

    @Test
    void equalsCatForAnother() {
        Cat cat = new Cat("brown", 4000, "persian", "Jerry");
        Cat cat1 = new Cat("white", 40, "bengal", "Tom");
        Assertions.assertNotEquals(cat.hashCode(), cat1.hashCode());
    }
}

