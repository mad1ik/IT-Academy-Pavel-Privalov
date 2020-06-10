package HomeTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class Table3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        if (var == 0){
            System.out.println("Значение не может равняться нулю");
            return;
        }
        if (var < 0){
            System.out.println("Значение должно быть больше нуля");
            return;
        }

        int res = 1;
        for (int i = 1; i < var ; i++) {
            System.out.print(res + " * " + (i + 1) + " = ");
            res = res * (i + 1);
            System.out.println(res);
        }
        System.out.println("Ответ: " + res);
    }
}