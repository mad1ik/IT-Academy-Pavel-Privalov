package HomeTask1;

public class Task1 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        //Побитовое OR (|)
        System.out.println(42 | 15); //101111, 47
        //Побитовый оператор OR (|) с присваниванием
        System.out.println(a |= b); //101111, 47

        //Побитовое AND (&)
        System.out.println(42 & 15); //1010, 10
        //Побитовый оператор AND (&) с присваниванием
        System.out.println(a &= b); //1010, 15

        //Побитовое XOR (^)
        System.out.println(42 ^ 15); //100101, 37
        //Побитовый исключающее XOR (^) с присваиванием
        System.out.println(a ^= b); //0, 0

        //Побитовое NOT (~)
        System.out.println(~ 42); //11111111111111111111111111010101, -43
        System.out.println(~ 15); //11111111111111111111111111110000, -16

        //Сдвиг влево
        System.out.println(42 << 2); //10101000, 168
        System.out.println(15 << 4); //11110000, 240
        System.out.println(a <<= b); //0, 0

        //Сдвиг вправо
        System.out.println(42 >> 2); //1010, 10
        System.out.println(15 >> 4); //0, 0
        System.out.println(a >>= b); //0, 0

        //Сдвиг вправо с заполнением нулями
        System.out.println(42 >>> 15); //0, 0
        System.out.println(42 >>> 15); //0, 0
        System.out.println(a >>>= b); //0, 0
    }
}