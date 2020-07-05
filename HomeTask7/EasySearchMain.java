package HomeTask7;

import java.util.ArrayList;

public class EasySearchMain {
    public static void main(String[] args) {
        String book = ("E:\\Java IT-Academy\\homework\\src\\HomeTask7\\Война и мир.txt");
        EasySearch easySearch = new EasySearch();
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Слово 'война' встречается - " + easySearch.search(book, "война") + " раз");
        list.add("война");
        System.out.println("Слово 'и' встречается - " + easySearch.search(book, "и") + " раз");
        list.add("и");
        System.out.println("Слово 'мир' встречается - " + easySearch.search(book, "мир") + " раз");
        list.add("мир");
        System.out.println(list.toString());

        //System.out.println(easySearch.getContent());

    }
}
