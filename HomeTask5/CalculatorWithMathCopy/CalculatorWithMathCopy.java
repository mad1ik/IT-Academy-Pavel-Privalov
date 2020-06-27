package HomeTask5.CalculatorWithMathCopy;

import HomeTask5.CalculatorWithOperator.ICaltulatorInterface;

public class CalculatorWithMathCopy implements ICaltulatorInterface {
    public final double div (double a, double b){
        return a / b;
    }

    public final double multiply (double a, double b){
        return a * b;
    }

    public final double plus (double a, double b){
        return a + b;
    }

    public final double minus (double a, double b){
        return a - b;
    }

    public final double exp (double a, double b){
        return Math.pow(a, b);
    }

    public final double mod (double a){
        return Math.abs(a);
    }

    public final double sqrt (double a){
        return Math.sqrt(a);
    }
}
