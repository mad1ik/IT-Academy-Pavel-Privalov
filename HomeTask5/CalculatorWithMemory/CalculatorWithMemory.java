package HomeTask5.CalculatorWithMemory;

import HomeTask5.CalculatorWithCounter.CalculatorWithCounter;
import HomeTask5.CalculatorWithOperator.ICaltulatorInterface;

public class CalculatorWithMemory implements ICaltulatorInterface {
    private ICaltulatorInterface calculator;
    private double memory;

    public CalculatorWithMemory(ICaltulatorInterface calculator){
        this.calculator = calculator;
    }

    double getMemory(){
        return memory;
    }

    public final void setMemory(double var){
        memory = var;
    }

    public final double div (double a, double b){
        return calculator.div(a,b);
    }

    public final double multiply (double a, double b){
        return calculator.multiply(a,b);
    }

    public final double plus (double a, double b){
        return calculator.plus(a,b);
    }

    public final double minus (double a, double b){
        return calculator.minus(a,b);
    }

    public double exp(double a, double b) {
        return calculator.exp(a,b);
    }

    public final double mod (double a){
        return calculator.mod(a);
    }

    public final double sqrt (double a){
        return calculator.sqrt(a);
    }
}
