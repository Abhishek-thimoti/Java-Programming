public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("String : " +sb);
        System.out.println("Length : " +sb.length());
        // Capacity = initialcapacity + length
        // Capacity = 16 + 4 = 20
        System.out.println("Capacity : " +sb.capacity());
    }
}
