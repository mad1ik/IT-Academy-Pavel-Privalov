package HomeTask2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер для всех массивов: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];
        int[] array4 = new int[size];

        int a = 0;
        System.out.println("Заполняем массив 'array1' циклом 'do...while':");
        do {
            array1[a] = scanner.nextInt();
            System.out.print(array1[a] + " ");
            a++;
        } while (a < array1.length);

        System.out.println();
        System.out.println("Каждый второй элемент массива 'array1' циклом 'do...while':");
        a = 0;
        do {
            System.out.print(array1[a] + " ");
            a += 2;
        } while (a < array1.length);

        System.out.println();

        int b = 0;
        System.out.println("Заполняем массив 'array2' циклом 'while':");
        while (b < array2.length){
            array2[b] = scanner.nextInt();
            System.out.print(array2[b] + " ");
            b++;
        }

        System.out.println();
        System.out.println("Каждый второй элемент массива 'array2' циклом 'while':");
        b = 0;
        while (b < array2.length){
            System.out.print(array2[b] + " ");
            b += 2;
        }

        System.out.println();
        int c;
        System.out.println("Заполняем массив 'array3' циклом 'for':");
        for (c = 0; c < array3.length; c++){
            array3[c] = scanner.nextInt();
            System.out.print(array3[c] + " ");
        }

        System.out.println();
        System.out.println("Каждый второй элемент массива 'array3' циклом 'for':");
        for (c = 0; c < array3.length; c+=2){
            System.out.print(array3[c] + " ");
        }

        System.out.println();

        System.out.println("Заполняем массив 'array4' циклом 'foreach':");
        for (int d = 0; d < array4.length; d++) {       //заполняем массив array4
            array4[d] = scanner.nextInt();
        }
        for (int var : array4) {                        //выводим массив array4 циклом for each
            System.out.print(var + " ");
        }

        System.out.println();
        System.out.println("Каждый второй элемент массива 'array4' циклом 'foreach':");
        int d = 0;
        for (int var : array4){
            if(d % 2 == 0){
                System.out.print(var  + " ");
            }
            d++;
        }
    }
}