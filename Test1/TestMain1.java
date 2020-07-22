package Test1;

import HomeTask2.Array;
import HomeTask8.RandomString;
import obj.core.Man;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class TestMain1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Man> manList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            manList.add(new Man(RandomString.random(5), rnd.nextInt(10)));
        }

        try (FileOutputStream fos = new FileOutputStream("manList1.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            for (int i = 0; i < 100; i++) {
                oos.writeObject(manList.get(i));
            }
            oos.writeObject(manList);
        } catch (IOException e){
            System.out.println("Ошибка записи файла");
        }

        ArrayList<Man> secondList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("manList1.bin");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            for (int i = 0; i < 100; i++) {
                secondList.add((Man) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Ошибка чтения файла");
        }
    }
}
