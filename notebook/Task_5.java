package notebook;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
        System.out.print("Сумма в рублях - " + cash + " ");

        if(cash % 10 == 2 || cash % 10 == 3 || cash % 10 == 4){
            System.out.println("рубля");
        }
        else if(cash % 100 == 11){
            System.out.println("рублей");
        }
        else if(cash % 10 == 1){
            System.out.println("рубль");
        }
        else {
            System.out.println("рублей");
        }
    }
}
