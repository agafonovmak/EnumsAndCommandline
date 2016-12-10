import org.apache.commons.cli.*;

/**
 * Created by Maxim on 10.12.2016.
 */
public final class CalculatorProgramProvider {

    public static CalculatorProgram createProgramFromCommandLine(String argc[]) throws ParseException {

        int leftOperand = 0;
        int rightOperand = 0;
        String operation = "";

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
            operation = commandLine.getOptionValue("o");
        }

        return new CalculatorProgram(operation, leftOperand, rightOperand);
    }
}
