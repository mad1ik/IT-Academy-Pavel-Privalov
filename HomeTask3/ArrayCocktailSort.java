package HomeTask3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Сортировка шейкером
public class ArrayCocktailSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int var;                                                //создаём переменную 'var' для дальнейшей подмены большего значения с меньшим
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){                 //заполняем массив случайными цифрами до 9
            array[i] = random.nextInt(10);
        }

        System.out.println("До сортировки: " + Arrays.toString(array));

        int leftElement = 0;
        int rightElement = array.length - 1;

        do {
            for (int i = leftElement; i < rightElement; i++){   //проходим массив слева направо и ищем максимальное значение
                if (array[i] > array[i+1]){                     //если N-элемент больше N-элемента справа, то
                    var = array[i];                             //меняем значения
                    array[i] = array[i+1];                      //меняем значения
                    array[i+1] = var;                           //меняем значения
                }
            }
            rightElement--;                                     //сокращаем проход цикла

            for (int i = rightElement; i > leftElement; i--){   //проходим массив справа налево и ищем минимальное значение
                if (array[i] < array[i-1]){                     //если N-элемент меньше N-элемента слева, то
                    var = array[i];                             //меняем значения
                    array[i] = array[i-1];                      //меняем значения
                    array[i-1] = var;                           //меняем значения
                }
            }
            leftElement++;
        } while (leftElement < rightElement);

        System.out.println("После шейкерной сортировки: " + Arrays.toString(array));
    }
}