package Test1;

import HomeTask8.RandomString;
import obj.core.Man;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TestMain2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Man> manList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            manList.add(new Man(RandomString.random(5), rnd.nextInt(10)));
        }

        try (FileOutputStream fos = new FileOutputStream("manList2.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(manList);
        } catch (IOException e){
            System.out.println("Ошибка записи файла");
        }

        try (FileInputStream fis = new FileInputStream("manList2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Ошибка чтения файла");
        }
    }
}
