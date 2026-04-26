public class File extends Node {
    int size;
    String fileExtension;
    String content;

    public File(int id, String name, Node parentNode, String content) {
        super(id, name, parentNode, null);
        this.size = content.length() * Content.BYTE_SIZE;
        this.fileExtension = name.split(".")[1];
        this.content = content;
    }
}
