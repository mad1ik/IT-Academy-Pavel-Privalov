package HomeTask5.CalculatorWithMemory;

import HomeTask5.CalculatorWithMathCopy.CalculatorWithMathCopy;
import HomeTask5.CalculatorWithOperator.CalculatorWithOperator;

public class CalculatorWithMemory_Task_14 {
    public static void main(String[] args) {
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithOperator());

        calcMemory.setMemory(calcMemory.div(28,5));
        calcMemory.setMemory(calcMemory.exp(calcMemory.getMemory(), 2));
        calcMemory.setMemory(calcMemory.plus(calcMemory.getMemory(), 4.1));
        calcMemory.setMemory(calcMemory.plus(calcMemory.getMemory(), calcMemory.multiply(15,7)));
        System.out.println(calcMemory.getMemory());
    }
}
