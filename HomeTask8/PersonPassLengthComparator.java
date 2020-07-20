package HomeTask8;

import java.util.Comparator;

public class PersonPassLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}