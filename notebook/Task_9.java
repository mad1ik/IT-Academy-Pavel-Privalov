package notebook;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, maxInt = 0;

        while (a < 10){
            int var = (int) (Math.random() * 50);
            System.out.println(var);
            if (var > maxInt){
                maxInt = var;
            }

            a++;
        }
        System.out.println("Наибольшее число = " + maxInt);
    }
}