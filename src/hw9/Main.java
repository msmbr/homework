package hw9;

public class Main {
    public static void main(String[] args) {
        Collection collection1 = new StringArray();
        collection1.add("a");
        collection1.add("B");
        collection1.add("c");

        System.out.println(collection1);
        System.out.println("contain: " + collection1.contain("B"));
        System.out.println("size: " + collection1.size());

        Collection collection2 = new StringArray();
        collection2.add("a");
        collection2.add("B");
        collection2.add("c");

        System.out.println("collection equals: " + collection1.equals(collection2));

        System.out.println("clear: " + collection1.clear());
        System.out.println("after clear: " + collection1);

    }
}
