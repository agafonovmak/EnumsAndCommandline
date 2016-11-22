import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] argc) throws ParseException{

        int leftOperand = 0;
        int rightOperand = 0;
        char operation = ' ';

        Option leftOption = new Option("l", true, "Left");
        Option rightOption = new Option("r", true, "Right");
        Option operationOption = new Option("o", true, "Operation");

        Options posixOptions = new Options();
        posixOptions.addOption(leftOption);
        posixOptions.addOption(rightOption);
        posixOptions.addOption(operationOption);

        CommandLineParser cmdLinePosixParser = new PosixParser();// создаем Posix парсер
        CommandLine commandLine = cmdLinePosixParser.parse(posixOptions, argc);


        if (commandLine.hasOption("l")) {
            leftOperand = Integer.parseInt(commandLine.getOptionValue("l"));
        }
        if (commandLine.hasOption("l")) {
            rightOperand = Integer.parseInt(commandLine.getOptionValue("r"));
        }
        if (commandLine.hasOption("o")) {
            operation = commandLine.getOptionValue("o").charAt(0);
        }

        System.out.println(String.valueOf(calculate(leftOperand, rightOperand, operation)));


    }

    public static int calculate(int left, int right, char operation) {
        switch (operation) {
            case '+': {
                return left + right;
            }
            case '-': {
                return left - right;
            }
            case '*': {
                return left * right;
            }
            case '/': {
                return left / right;
            }
            default: {
                System.out.println("Некорректная операция");
                return 0;
            }
        }
    }
}
