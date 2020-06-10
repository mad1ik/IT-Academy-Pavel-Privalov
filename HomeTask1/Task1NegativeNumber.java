package HomeTask1;

public class Task1NegativeNumber {
    public static void main(String[] args) {
        int a = -42; //11111111111111111111111111010110
        int b = -15; //11111111111111111111111111110001

        //Побитовое OR (|)
        System.out.println(-42 | -15); //11111111111111111111111111110111, -9
        //Побитовый оператор OR (|) с присваниванием
        System.out.println(a |= b); //11111111111111111111111111110111, -9

        //Побитовое AND (&)
        System.out.println(-42 & -15); //11111111111111111111111111010000, -48
        //Побитовый оператор AND (&) с присваниванием
        System.out.println(a &= b); //11111111111111111111111111110001, -15

        //Побитовое XOR (^)
        System.out.println(-42 ^ -15); //100111, 39
        //Побитовый исключающее XOR (^) с присваиванием
        System.out.println(a ^= b); //0, 0

        //Побитовое NOT (~)
        System.out.println(~ -42); //101001, 41
        System.out.println(~ -15); //1110, 14

        //Сдвиг влево
        System.out.println(-42 << -1); //0, 0
        System.out.println(-15 << -2); //1000000000000000000000000000000, 1073741824
        System.out.println(a <<= b); //0, 0

        //Сдвиг вправо
        System.out.println(-42 >> -1); //11111111111111111111111111111111, -1
        System.out.println(-15 >> -2); //11111111111111111111111111111111, -1
        System.out.println(a >>= b); //0, 0

        //Сдвиг вправо с заполнением нулями
        System.out.println(-42 >>> -15); //111111111111111, 32767
        System.out.println(-42 >>> -15); //111111111111111, 32767
        System.out.println(a >>>= b); //0, 0
    }
}