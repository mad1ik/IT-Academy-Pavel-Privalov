package HomeTask4;

import java.util.Arrays;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stickCount = 3;
        int maxNumber = 8;
        int maxIndex = 0;

        //Указываем количество колец для стержня
        System.out.print("Введите количество колец - от 3 до 8: ");
        int countRings = scanner.nextInt();
        //Проверяем на правильность количества колец
        if (countRings < 3 || countRings > 8) {
            System.out.print("Минимальное количество колец - 3, максимальное - 8, введите число повторно: ");
            while (countRings < 3 || countRings > 8){
                countRings = scanner.nextInt();
                if (countRings > 2 && countRings < 9){
                    continue;
                }
                System.out.print("Минимальное количество колец - 3, максимальное - 8, введите число повторно: ");
            }
        }

        int pike[][] = new int[countRings][stickCount];
        //Заполняем первый стержень значениеми от 1 до вышеуказанного количества
        for (int i = 0; i < pike.length; i++) {
            pike[i][0] = i + 1;
        }

        //Создаём массив для проверки + заполняем третий стержень для проверки
        int temp[][] = new int[countRings][stickCount];
        for (int i = 0; i < pike.length; i++) {
            temp[i][2] = i + 1;
        }

        //Выводим поле в консоль
        System.out.println("Вывод игрового поля:");
        printZone(pike);

        while (!Arrays.deepEquals(pike, temp)){
            System.out.print("Какое элемент вы хотите взять? ");
            int input = scanner.nextInt();

            //Проходим массив, вместо введённого элемента ставим ноль
            for (int i = 0; i < pike.length; i++) {
                for (int j = 0; j < pike[i].length; j++) {
                    if (pike[i][j] == input){
                        pike[i][j] = 0;
                    }
                }
            }

            while (true){
            System.out.print("В какую строку перенести значение? ");
            int line = scanner.nextInt() - 1;
            System.out.print("В какой столбец перенести значение? ");
            int column = scanner.nextInt() - 1;

            if (pike[line][column] != 0){
                System.out.println("Требуется ввести значение в пустое поле! Введите повторно: ");
                continue;
            }

            pike[line][column] = input;
                break;
            }

            printZone(pike);
        }
        System.out.println("Игра окончена!");
    }

    public static void printZone(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("* ");
                }
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}