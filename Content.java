// This class contains all the static messages, enums, constants, etc.

import java.util.Map;

import enums.Command;
import enums.ErrorMessage;

public class Content {
    public static final int BYTE_SIZE = 4;

    public static final Map<String, String> COMMANDS = Map.of(
            Command.PWD.getCommandString(), "Displays the current location.",
            Command.INFO.getCommandString(),
            "Displays the list of all the legal and allowed commands along with their descriptions",
            Command.EXIT.getCommandString(), "Exit the simulator");

    public static final Map<String, String> ERROR_MESSAGES = Map.of(
            ErrorMessage.INVALID_BASE_COMMAND.getErrorMessageKey(),
            "Invalid base command. Kindly run \"info\" command to check the command manual for the correct base commands");
}
