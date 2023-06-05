package hw12;

public class Main {
    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();
        // task 7
        System.out.println("task 7: ");
        fileNavigator.add("folder", new FileData("f7.txt", 500, "folder4"));

        // 2
        fileNavigator.add(new FileData("f1.txt", 200, "folder1"));
        fileNavigator.add(new FileData("f2.txt", 700, "folder1"));
        fileNavigator.add(new FileData("f3.txt", 500, "folder1"));
        fileNavigator.add(new FileData("f4.txt", 400, "folder2"));
        fileNavigator.add(new FileData("f5.txt", 100, "folder2"));
        fileNavigator.add(new FileData("f6.txt", 300, "folder3"));
        fileNavigator.add(new FileData("f6.txt", 500, "folder3"));
        System.out.println("2) add: ");
        fileNavigator.print();

        System.out.println("3) find folder2: ");
        fileNavigator.find("folder2").forEach(System.out::println);
        System.out.println("4) filterBySize 300: ");
        fileNavigator.filterBySize(300).forEach(System.out::println);
        System.out.println("6) sortBySize: ");
        fileNavigator.sortBySize().forEach(System.out::println);

        System.out.println("5) remove folder2: ");
        fileNavigator.remove("folder2");
        fileNavigator.print();

    }
}
