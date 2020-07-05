package notebook;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int radius = scanner.nextInt();
        int diameter = radius * 2;
        if (diameter < length && diameter < width){
            System.out.println("Можно полностью закрыть");
        }
        else
            System.out.println("Нельзя закрыть");
    }
}
