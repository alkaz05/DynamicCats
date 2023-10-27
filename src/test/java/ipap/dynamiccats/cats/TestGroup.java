package ipap.dynamiccats.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TestGroup {
    @Test
    public void test1() throws IOException {
        Group g1 = new Group();
        g1.loadFromFile("test1");
        ArrayList<Cat> a = new ArrayList<>();
        a.add(new Cat("Барсик", "мурр"));
        a.add(new Cat("Васька", "шшшшш"));
        Assertions.assertIterableEquals(a, g1.cats);
    }
}
