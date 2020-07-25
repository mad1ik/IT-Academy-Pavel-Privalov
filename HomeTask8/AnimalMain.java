package HomeTask8;

import java.util.*;

public class AnimalMain extends AnimalAgeComparator {
    public static void main(String[] args) {
        ArrayList<Animal> listAnimal = new ArrayList<>();
        Random random = new Random();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listAnimal.add(new Animal(random.nextInt(5), RandomString.random(5)));
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Время заполнения 'listAnimal' в миллисекундах: " + totalTime1);

        listAnimal.sort(new AnimalAgeComparator());

        long startTime2 = System.currentTimeMillis();
        while (!listAnimal.isEmpty()){
            listAnimal.remove(0);
        }
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Время удаления 'listAnimal' в миллисекундах: " + totalTime2);
    }
}
