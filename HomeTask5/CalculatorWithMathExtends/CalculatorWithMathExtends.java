package HomeTask5.CalculatorWithMathExtends;

import HomeTask5.CalculatorWithMathCopy.CalculatorWithMathCopy;
import HomeTask5.CalculatorWithOperator.CalculatorWithOperator;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public final double pow (double a, double b){
        return Math.pow(a, b);
    }

    public final double abs (double a){
        return Math.abs(a);
    }

    public final double sqrt1 (double a){
        return Math.sqrt(a);
    }
}
