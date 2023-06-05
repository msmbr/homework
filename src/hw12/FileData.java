package hw12;

public class FileData {
    private String fileName;
    private long size;
    private String filePath;

    public FileData(String fileName, long size, String filePath) {
        this.fileName = fileName;
        this.size = size;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
