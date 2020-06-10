package HomeTask2;

import java.util.Scanner;
//Таблица умножения с 1 до 10 включительно
public class Table1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                int res = i * n;
                System.out.printf(n + " * " +  i + " = " + res + "\t\t");
            }
            System.out.println();
        }
    }
}