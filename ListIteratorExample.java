import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> a = new LinkedList<>();

        // Add elements
        a.add("Java");
        a.add("Python");
        a.add("C");
        a.add("C++");
        a.add("JavaScript");

        // Create ListIterator
        ListIterator<String> ll = a.listIterator();

        // Forward traversal
        System.out.println("Traverse the elements in forward direction:");
        while (ll.hasNext()) {
            System.out.println(ll.next());
        }

        // Backward traversal
        System.out.println("Traverse the elements in backward direction:");
        while (ll.hasPrevious()) {
            System.out.println(ll.previous());
        }
    }
}