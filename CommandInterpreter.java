import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import enums.Command;
import enums.ErrorMessage;
import exceptions.InvalidBaseCommandException;

public class CommandInterpreter {
    private Command getCommandEnumKey(String baseCommand) {
        for (Command cmd : Command.values()) {
            if (cmd.getCommandString().equals(baseCommand))
                return cmd;
        }
        return null;
    }

    public static void interpret(String entireCommand) throws InvalidBaseCommandException {
        String[] splittedCommand = entireCommand.split(" ");
        String baseCommand = splittedCommand[0];
        List<String> parameters = new ArrayList<>();

        for (int i = 1; i < splittedCommand.length; i++) {
            parameters.add(splittedCommand[i]);
        }

        if (!(Content.COMMANDS.containsKey(baseCommand)))
            throw new InvalidBaseCommandException(
                    Content.ERROR_MESSAGES.get(ErrorMessage.INVALID_BASE_COMMAND.getErrorMessageKey()));

        CommandInterpreter ci = new CommandInterpreter();
        Command baseCommandEnumValue = ci.getCommandEnumKey(baseCommand);

        switch (baseCommandEnumValue) {
            case INFO:
                ci.printCommandInfo();
                break;

            case PWD:
                Utils.printTitle("Current Location");

                System.out.println(Main.explorer.getHistoryString());
                break;

            case EXIT:
                break;
        }
    }

    private void printCommandInfo() {
        Utils.printTitle("Command Manual (V - 0.1)");

        for (Map.Entry<String, String> commandEntry : Content.COMMANDS.entrySet()) {
            System.out.println(commandEntry.getKey() + " - " + commandEntry.getValue());
        }
    }
}
