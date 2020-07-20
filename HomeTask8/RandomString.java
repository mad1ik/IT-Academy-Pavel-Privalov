package HomeTask8;

import java.util.ArrayList;
import java.util.Random;

public class RandomString {
    static String availableWords = "ABCDEFGHIJKLMONPQRSTUVWXYZ" +
                                   "abcdefghijklmonpqrstuvwxyz" +
                                   "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
                                   "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";

    public static String random(int stringLength){
        if (stringLength < 1){
            throw new IllegalArgumentException();
        }

        StringBuilder nStr = new StringBuilder(stringLength);
        Random random = new Random();

        for (int i = 0; i < stringLength; i++) {
            int rndInt = random.nextInt(availableWords.length());
            char rndChar = availableWords.charAt(rndInt);
            nStr.append(rndChar);
        }
        return nStr.toString();
    }
}
