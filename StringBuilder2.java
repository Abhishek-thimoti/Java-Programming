public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Capacity tells you the how many elements it can hold
        // StringBuildername.capacity();
        System.out.println("Initial capacity : " + sb.capacity());
        sb.append("abcdefghijklmnokpqrstuvwxyz"); 
        System.out.println("Length : " +sb.length()); //25
        System.out.println("New Capacity : " +sb.capacity());
    }
}
