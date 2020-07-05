package HomeTask5.CalculatorWithOperator;

////4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double res = calc.plus((calc.plus(4.1,calc.multiply(15, 7))), calc.exp(calc.div(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println(res / 0);
        System.out.println(res / 0.0d);
        // Положительное число, разделенное на 0.0, дает «плюс бесконечность»,
        // а отрицательное – «минус бесконечность».
    }
}
