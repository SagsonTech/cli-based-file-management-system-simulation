import java.util.Scanner;

public class Main {
    private static Explorer explorer;
    private static boolean isActive;
    private static Scanner sc;

    public static void init() {
        isActive = true;
        Directory CDrive = new Directory(0, "CDrive", null);
        explorer = new Explorer(CDrive);
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        init();
        Utils.printTitle("CLI-Based File Management System Simulation");

        do {
            System.out.print(explorer.getHistoryString() + "> ");
            String command = sc.nextLine().trim();
            if (command.equals("exit"))
                isActive = false;
            System.out.println("Executed Command: " + command);
        } while (isActive);
    }
}