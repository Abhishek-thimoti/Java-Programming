class Demo{
    static int x=10;  //static variable
    int y=20;   //Instance variable
    void show(){
        int z=30;  //Local variable
        System.out.println("Static:"+x);
        System.out.println("Instance:"+y);
        System.out.println("Local:"+z);
    }
}

public class TypesofVariable{
    public static void main(String[] args){
        Demo obj1=new Demo();
        obj1.show();
        Demo obj2=new Demo();
        obj2.y=40;
        obj2.show();
    }
}