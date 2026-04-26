import java.time.LocalDateTime;

public class Node {
    int id;
    String name;
    Node parentNode;
    Node childNode;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Node(int id, String name, Node parentNode, Node childNode) {
        this.id = id;
        this.name = name;
        this.parentNode = parentNode;
        this.childNode = childNode;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
