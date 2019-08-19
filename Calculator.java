public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperator, char Operator) {
        switch (Operator) {
            case ADDITION:
                return firstOperand + secondOperator;
            case SUBTRACTION:
                return firstOperand - secondOperator;
            case MULTIPLICATION:
                return firstOperand * secondOperator;
            case DIVISION:
                if (secondOperator != 0)
                    return firstOperand / secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}