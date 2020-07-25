package HomeTaskAdd;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10...");

        int count = 0;
        do{
            String str = scanner.nextLine();
            try{
                int number = Integer.parseInt(str);
                if(number < 1 || number > 10){
                    throw new IOException();
                }
                else
                    System.out.println(str);
                    break;
            } catch (NumberFormatException e){
                count++;
                System.err.println("'" + str + "' не является числом.");
            } catch (IOException e){
                count++;
                if (count == 3){
                    break;
                }
                System.err.println("Введите число заново в нужном диапазоне.");
            }
        } while (count != 3);
    }
}