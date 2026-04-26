public class Directory extends Node {
    int accumulatedSize;
    int fileCount;

    public Directory(int id, String name, Node parentNode) {
        super(id, name, parentNode, null);
        this.accumulatedSize = 0;
        this.fileCount = 0;
    }
}
