package HomeTask5.CalculatorWithOperator;

public class CalculatorWithOperator implements ICaltulatorInterface {
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
        double res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        return res;
    }

    public final double mod (double a){
        if (a > 0){
            return a;
        }
        else if (a < 0){
            return a = a - (a * 2);
        }
        else
            return 0;
    }

    public final double sqrt (double a){
        double res = a;
        double div = a;
        if(a <= 0){
            return 0;
        }

        while (true){
            div = (a / div + div) / 2;
            if (res > div){
                res = div;
            }
            else
                return res;
        }
    }
}