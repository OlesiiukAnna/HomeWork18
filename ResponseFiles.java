package home.Task_18;

public class ResponseFiles {

    private String fileName;

    public ResponseFiles() {
    }

    public ResponseFiles(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return this.fileName;
    }
}
