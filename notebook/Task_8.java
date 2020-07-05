package notebook;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        int res = 1;
        int count = 1;
        while(count <= var){
            res = res * count;
            count++;
        }

        System.out.println("Факториал числа " + var + " является " + res);
    }
}
