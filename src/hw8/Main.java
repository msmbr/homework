package hw8;


public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        System.out.println("start: " + stringArray + "\n");

        //print
        String tstString;
        int tstIndex;

        System.out.printf("add value=%s: status=%s%n", tstString="a", stringArray.add(tstString));
        System.out.printf("add value=%s: status=%s%n", tstString="b",stringArray.add(tstString));
        System.out.printf("add value=%s: status=%s%n", tstString="b",stringArray.add(tstString));
        System.out.println(stringArray + "\n");

        System.out.printf("add value=%s index=%s: status=%s%n", tstString="b", tstIndex=10, stringArray.add(tstIndex, tstString));
        System.out.println(stringArray + "\n");

        System.out.printf("add value=%s index=%s: status=%s%n", tstString="c", tstIndex=2, stringArray.add(tstIndex, tstString));
        System.out.println(stringArray + "\n");

        System.out.printf("delete index=%s: status=%s%n", tstIndex=0, stringArray.delete(tstIndex));
        System.out.println(stringArray + "\n");

        System.out.printf("delete value=%s: status=%s%n", tstString="b", stringArray.delete(tstString));
        System.out.println(stringArray + "\n");

        System.out.printf("get index=%s: %s%n%n", tstIndex=0, stringArray.get(tstIndex));
    }
}
