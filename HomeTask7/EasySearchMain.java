package HomeTask7;

import HomeTask2.Array;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EasySearchMain extends EasySearch {
    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        String book = ("D:\\Java IT-Academy\\homework\\src\\HomeTask7\\Война и мир.txt");

        //Подсчёт слов 'война', 'и', 'мир'
        System.out.println("Слово 'война' встречается - " + easySearch.search(book, "война") + " раз");
        System.out.println("Слово 'и' встречается - " + easySearch.search(book, "и") + " раз");
        System.out.println("Слово 'мир' встречается - " + easySearch.search(book, "мир") + " раз");

        //Подсчёт уникальных слов
        String[] arrBook = easySearch.getContent()
                .toLowerCase()
                .replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "")
                .trim()
                .split(" ");

        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String part : arrBook) {
            if (!uniqueWords.contains(part)) {
                uniqueWords.add(part);
            }
        }
        System.out.println("Количество уникальных слов - " + uniqueWords.size());

        //Сколько каждое слово встречается в тексте
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (String part : arrBook) {
            if (!wordCounter.containsKey(part)){
                wordCounter.put(part, 0);
            }
            wordCounter.put(part, wordCounter.get(part) + 1);
        }

       //Создаём и выводим список с наиболее встречаемыми словами
       List<Map.Entry<String, Integer>> mostWordCounter = new ArrayList<>(wordCounter.entrySet());
       Collections.sort(mostWordCounter, new Comparator<Map.Entry<String, Integer>>() {

           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o2.getValue().compareTo(o1.getValue());
           }
       });

        for (int i = 1; i < 11; i++) {
            Map.Entry<String, Integer> top10 = mostWordCounter.get(i);
            System.out.println("Слово '" + top10.getKey() + "' встречается - " + top10.getValue() + " раз");
        }
    }
}