package ipap.dynamiccats.cats;

import java.util.Objects;

public class Cat {
    String name, speech;

    public String getName() {
        return name;
    }

    public String getSpeech() {
        return speech;
    }

    public Cat(String name, String speech) {
        this.name = name;
        this.speech = speech;
    }

    public String say(){
        return name+" : "+speech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(speech, cat.speech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speech);
    }
}
