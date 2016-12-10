import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] argc){

        try {
            CalculatorProgram program = CalculatorProgramProvider.createProgramFromCommandLine(argc);
            Calculator calculator = new Calculator(program);
            System.out.println(String.valueOf(calculator.executeProgram()));
        }
        catch (ParseException exception){
            System.out.println("Некорректный ввод");
        }
    }

}
