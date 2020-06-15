package HomeTask3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Сортировка Выбором
public class ArraySelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){               //заполняем массив случайными цифрами до 9
            array[i] = random.nextInt(10);
        }

        System.out.println("До сортировки: " + Arrays.toString(array));

        for (int left = 0; left < array.length; left++){      //проход по циклу
            int min = left;                                   //инициилизируем первый элемент
            for (int k = min + 1; k < array.length; k++){     //проходим массив слева направо, с увеличением элемента на 1
                if (array[k] < array[min]){                   //если правый элемент меньше левого, то идёт замена этих двух элементов
                    min = k;                                  //подмена элементов
                }
            }
            int var = array[left];
            array[left] = array[min];
            array[min] = var;
        }

        System.out.print("После сортировки выбором: " + Arrays.toString(array));
    }
}