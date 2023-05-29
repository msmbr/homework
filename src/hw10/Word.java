package hw10;

public class Word {
    private String name;
    private int occurrence;

    public Word(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return occurrence;
    }

    public void setCount(int count) {
        this.occurrence = count;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
