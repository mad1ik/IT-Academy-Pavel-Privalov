package HomeTask2;

import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер таблицы:");
        int var;
        table(var = scanner.nextInt());
    }

    static void table(int var) {
        for (int i = 1; i <= var; i++) {
            for (int n = 1; n <= var; n++) {
                int res = i * n;
                System.out.print(n + " * " + i + " = " + res + "\t\t");
            }
            System.out.println();
        }
    }
}