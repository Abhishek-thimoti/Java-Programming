import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(null, "Python");
        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "C++");
        map.put(null, "Java Programming"); // This will overwrite "Python"
        map.put(4, "C#");
        
        System.out.println(map);
    }
}