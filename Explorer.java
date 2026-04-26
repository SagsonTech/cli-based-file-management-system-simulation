import java.util.Stack;

public class Explorer {
    public Stack<Directory> historyStack;

    public Explorer(Directory CDrive) {
        this.historyStack = new Stack<Directory>();
        historyStack.push(CDrive);
    }

    public String getHistoryString() {
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        for (Directory dir : historyStack) {
            sb.append(dir.name).append('/');
        }

        return sb.toString();
    }
}