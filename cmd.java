public class cmd {
    public static void main(String args[]) {
        // String s1 = args[0];
        // String s2 = args[1];
        // System.out.print("String : " +s1+s2);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("Sum of a,b,c : " +(a+b+c));
    }
}
