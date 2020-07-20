package HomeTask8;

import java.util.Comparator;
import java.util.LinkedList;

public class PersonMain {
    public static void main(String[] args) {
        LinkedList<Person> listPerson = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            listPerson.add(new Person(RandomString.random(5), RandomString.random(5)));
        }
    }
}
