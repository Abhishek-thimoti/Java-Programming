import java.util.LinkedList;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("JavaProgramming");
        ll.add(0,"CProgramming");
        ll.addFirst("PythonProgramming");
        ll.addLast("CPP");
        System.out.println("Linked List: " + ll);
        ll.remove("CPP");
        System.out.println("Linked List after removing : " + ll);
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
    }
}
