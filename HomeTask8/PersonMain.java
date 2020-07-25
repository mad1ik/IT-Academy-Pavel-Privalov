package HomeTask8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class PersonMain {
    public static void main(String[] args) {
        LinkedList<Person> listPerson = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listPerson.add(new Person(RandomString.random(5), RandomString.random(5)));
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Время заполнения 'listPerson' в миллисекундах: " + totalTime1);

        listPerson.sort(new PersonPassLengthComparator());

        Iterator<Person> iterator = listPerson.iterator();
        long startTime2 = System.currentTimeMillis();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Время удаления 'listPerson' в миллисекундах: " + totalTime2);
    }
}
