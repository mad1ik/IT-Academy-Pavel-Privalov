package HomeTask3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Сортировка с использованием вставками
public class ArrayInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){                 //заполняем массив случайными цифрами до 9
            array[i] = random.nextInt(10);
        }

        System.out.println("До сортировки: " + Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {       //проходим по циклу
            int var = array[left];                              //даём переменной 'var' значение элемента цикла
            int i = left - 1;                                   //даём переменной 'i' значение, которое перед элементом
            while (i >= 0){
                if (var < array[i]){
                    array[i + 1] = array[i];
                }
                else break;
                i--;
            }
        }

        System.out.print("После сортировки с использованием вставками: " + Arrays.toString(array));
    }
}