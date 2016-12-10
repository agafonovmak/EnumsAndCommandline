public class CalculatorProgram {
    private int left;
    private int right;
    private String operation;


    public CalculatorProgram(String operation, int left, int right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }


    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public String getOperation() {
        return operation;
    }
}
