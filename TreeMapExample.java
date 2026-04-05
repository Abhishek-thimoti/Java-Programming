import java.util.Comparator;
import java.util.TreeMap;
class MyComparator implements Comparator<Integer>{
    public int compare(Integer a , Integer b){
        return b.compareTo(a); // For descending order
    }
}
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer , String> map = new TreeMap<>();
        map.put(10,"Java");
        map.put(2,"C");
        map.put(9,"C++");
        map.put(5, "C#");
        map.put(, "Rust");
    }  
}
