package HomeTask5.CalculatorWithCounter;

import HomeTask5.CalculatorWithMathCopy.CalculatorWithMathCopy;
import HomeTask5.CalculatorWithMathExtends.CalculatorWithMathExtends;
import HomeTask5.CalculatorWithOperator.CalculatorWithOperator;
import HomeTask5.CalculatorWithOperator.ICaltulatorInterface;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithOperator());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathCopy());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathExtends());

        double a = calculatorWithCounter.multiply(15,7);
        double b = calculatorWithCounter.plus(4.1, a);
        double c = calculatorWithCounter.div(28,5);
        double d = calculatorWithCounter.exp(c,2);
        double res = calculatorWithCounter.plus(b, d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println("Число операций = " + calculatorWithCounter.getCountOperation());

        System.out.println(calculatorWithCounter.div(res, 0));
        System.out.println(calculatorWithCounter.div(res, 0.0d));
    }
}