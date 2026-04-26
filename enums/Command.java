package enums;

public enum Command {
    INFO("info"),
    PWD("pwd"),
    EXIT("exit");

    private String commandString;

    private Command(String commandString) {
        this.commandString = commandString;
    }

    public String getCommandString() {
        return commandString;
    }
}
