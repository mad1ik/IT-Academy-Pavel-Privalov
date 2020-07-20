package HomeTask8;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalMain extends AnimalAgeComparator {
    public static void main(String[] args) {
        ArrayList<Person> listAnimal = new ArrayList<>();

        for (int i = 0; i < 100_000_000; i++) {
            listAnimal.add(new Person(RandomString.random(5), RandomString.random(5)));
        }
    }
}
