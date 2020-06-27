package HomeTask5.CalculatorWithMemory;

import HomeTask5.CalculatorWithOperator.CalculatorWithOperator;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithOperator());
        //CalculatorWithOperator calc = new CalculatorWithOperator();
        double temp1, temp2;

        temp1 = calcMemory.multiply(15,7);
        calcMemory.setMemory(temp1);
        calcMemory.setMemory(calcMemory.plus(4.1, calcMemory.getMemory()));
        temp1 = calcMemory.getMemory();
        System.out.println(temp1);
        calcMemory.setMemory(calcMemory.exp(calcMemory.div(28,5), 2));
        temp2 = calcMemory.getMemory();
        calcMemory.setMemory(calcMemory.plus(temp1, temp2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcMemory.getMemory());
    }
}
