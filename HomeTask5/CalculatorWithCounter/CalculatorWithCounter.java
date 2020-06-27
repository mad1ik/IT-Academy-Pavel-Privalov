package HomeTask5.CalculatorWithCounter;

import HomeTask5.CalculatorWithMathCopy.CalculatorWithMathCopy;
import HomeTask5.CalculatorWithMathExtends.CalculatorWithMathExtends;
import HomeTask5.CalculatorWithOperator.CalculatorWithOperator;
import HomeTask5.CalculatorWithOperator.ICaltulatorInterface;

public class CalculatorWithCounter {
    private ICaltulatorInterface calculator;
    private int counter;

    public int getCountOperation(){
        return counter;
    }

    public CalculatorWithCounter(ICaltulatorInterface calculator){
        this.calculator = calculator;
    }

    public final double div (double a, double b){
        counter ++;
        return calculator.div(a,b);
    }

    public final double multiply (double a, double b){
        counter ++;
        return calculator.multiply(a,b);
    }

    public final double plus (double a, double b){
        counter ++;
        return calculator.plus(a,b);
    }

    public final double minus (double a, double b){
        counter ++;
        return calculator.minus(a,b);
    }

    //Степень
    public final double exp (double a, double b){
        counter ++;
        return calculator.exp(a,b);
    }

    //Модуль
    public final double mod (double a){
        counter ++;
        return calculator.mod(a);
    }

    //Корень
    public final double sqrt (double a){
        counter ++;
        return calculator.sqrt(a);
    }
}
