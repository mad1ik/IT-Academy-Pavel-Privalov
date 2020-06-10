package HomeTask1;

import java.util.Scanner;

public class Task3IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.next();

        if(name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if(name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}