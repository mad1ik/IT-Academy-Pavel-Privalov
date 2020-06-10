package HomeTask1;

public class Task2 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8, d = 7, e = 20, f = 22, g = 68, h = 119, i = 6, j = 2, k = 12, l = 3;
        boolean T = true, F = false;

        System.out.println(a + b / c);  // 5+0 = 5
        System.out.println((a + b) / c);    // 7/8 = 0
        System.out.println((a + b++) / c);  // 5+2/7 = 0
        // b = 3
        System.out.println((a + b++) / --c); // 8/7 = 1
        // b = 4   c = 7
        System.out.println((a * b >> b++) / --c); // ((20 >> 4) / 6) - Далее - 1 / 6 = 0
        // b = 5   c = 6
        System.out.println((a + d > e ? g : f * b >> b++) / --c); // a + d > e = false - Далее -  22 * 5 >> 5 = 1 - Далее - 1 / 5 = 0
        // b = 6   c = 5
        System.out.println((a + d > e ? g : f * b >> b++) / --c); // 5+7 > 20 = false - Далее - 132>>6 = 2 - Далее - 2/4=0
        /* Комментарии по примеру выше:
        Выражение g >= g - нелогично, т.к. в данном примере мы не можем boolean использовать с int */
        System.out.println(i - j > l && k * k <= h); // 4 > 3 && 144 <= 119 - Далее - True && False - Ответ False, исходя из таблицы истинности
        System.out.println(T && F); //Ответ аналогичен предыдущему
    }
}