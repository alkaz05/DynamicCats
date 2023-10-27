package ipap.dynamiccats.cats;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Group {
    ArrayList<Cat> cats = new ArrayList<>();

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void loadFromFile(String fname) throws IOException {
        cats.clear();
        List<String> lines = Files.readAllLines(Path.of(fname));
        for (String s: lines) {
            String[] words = s.split(" ");
            Cat cat = new Cat(words[0], words[1]);
            cats.add(cat);
        }
    }
}
