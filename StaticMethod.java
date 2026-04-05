class Add{
    static int add(int a , int b)
    {
        return a+b;
    }
}

public class StaticMethod{
    public static void main(String[] args){
        int result = Add.add(4,5);
        System.out.println(result);
    }
}