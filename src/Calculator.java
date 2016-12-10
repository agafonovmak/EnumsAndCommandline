public class Calculator {
    private CalculatorProgram program;

    public Calculator(CalculatorProgram program) {
        this.program = program;
    }

    public int executeProgram(){
        switch (program.getOperation()) {
            case "+": {
                return program.getLeft() + program.getRight();
            }
            case "-": {
                return program.getLeft() - program.getRight();
            }
            case "*": {
                return program.getLeft() * program.getRight();
            }
            case "/": {
                return program.getLeft() / program.getRight();
            }
            default: {
                System.out.println("Некорректная операция");
                return 0;
            }
        }
    }
}
