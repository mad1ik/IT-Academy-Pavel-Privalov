package HomeTask2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){         ////заполняем массив случайными цифрами до 9
            array[i] = random.nextInt(10);
        }

        System.out.println("До сортировки: " + Arrays.toString(array));

        for (int i = array.length-1; i > 0 ; i--) {      //проходим массив справа налево
            for (int j = 0; j < i; j++) {                //проходим массив слева направо, чтобы сравнить элементы 'i' и 'j' попарно
                if(array[j] > array[j+1]){
                    int var = array[j];                  //создаём переменную 'var' для последующей подмены элементов массива
                    array[j] = array[j+1];               //больший элемент становится на место меньшего элемента
                    array[j+1] = var;                    //меньший элемент становится на место большего элемента
                }
            }
        }

        System.out.println("После сортировки пузырьком: " + Arrays.toString(array));
    }
}