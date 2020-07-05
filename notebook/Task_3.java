package notebook;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        if (var % 10 == 7){
            System.out.println("Последней цифрой является семёрка");
        }
        else
            System.out.println("Последняя цифра не является семёркой");
    }
}
