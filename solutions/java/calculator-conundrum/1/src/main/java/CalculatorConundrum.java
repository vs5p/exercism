class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation)
            throws IllegalOperationException {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        switch (operation) {

            case "+":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);

            case "*":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);

            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException(
                    "Division by zero is not allowed",
                    new ArithmeticException("Division by zero")
    );
}
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);

            case "":
                throw new IllegalArgumentException("Operation cannot be empty");

            default:
                throw new IllegalOperationException("Operation " + "'" + operation + "'" + " does not exist");
        }
    }
}