import java.util.Scanner;

import exceptions.InvalidBaseCommandException;

public class Main {
    public static Explorer explorer;
    private static boolean isActive;
    private static Scanner sc;

    public static void init() {
        isActive = true;
        Directory CDrive = new Directory(0, "CDrive", null);
        explorer = new Explorer(CDrive);
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws InvalidBaseCommandException {
        init();
        Utils.printTitle("CLI-Based File Management System Simulation");

        do {
            System.out.print(explorer.getHistoryString() + "> ");
            String command = sc.nextLine().trim();
            if (command.equals("exit")) {
                isActive = false;
                break;
            }

            try {
                CommandInterpreter.interpret(command);
            } catch (Exception e) {
                Utils.printTitle("Error");
                System.out.println(e.getMessage());
            }
        } while (isActive);
    }
}