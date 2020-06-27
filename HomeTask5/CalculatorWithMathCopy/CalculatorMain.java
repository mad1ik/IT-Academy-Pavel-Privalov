package HomeTask5.CalculatorWithMathCopy;


public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double a = calc.multiply(15,7);
        double b = calc.plus(4.1, a);
        double c = calc.div(28,5);
        double d = calc.exp(c,2);
        double res = calc.plus(b, d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);

        System.out.println(res / 0);
        System.out.println(res / 0.0d);
        // Положительное число, разделенное на 0.0, дает «плюс бесконечность»,
        // а отрицательное – «минус бесконечность».
    }
}