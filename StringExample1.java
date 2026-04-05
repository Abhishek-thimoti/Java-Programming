public class StringExample1 {
    public static void main(String[] args) {
        String str1 = "Java"; //it stores in a string constant pool
        String str2 = "Java";
        //by using new it creates 2 object one is stores in scp and another is stored in heap
        String str3 = new String("Java");
        // Check the instance  or address
        //equals -> Check the values
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        str1 = str1.concat("Programming"); //pointing to the new reference or object
        System.out.print(str1);
    }
}
