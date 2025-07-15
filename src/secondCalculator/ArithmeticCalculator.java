package secondCalculator;

public class ArithmeticCalculator {

    public double calculate(double a, double b, OperatorType op){

        switch(op){
            case ADD: return a + b;
            case SUBTRACT: return a - b;
            case MULTIPLY: return a * b;
            case DIVIDE: return a / b;
            default: throw new IllegalArgumentException("Invalid operation");
        }
    }

}
