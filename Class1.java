class student {
    //Properties
    int rollnumber;
    String name;
    String branch;

    //Behaviours
    void canWrite(){
        System.out.println("A Student can Write");
    }
    void canRead() {
        System.out.println("A student can read");
    }
    void display() {
        System.out.println("Rollnumber : " + rollnumber);
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
    }
}
public class Class1 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name = "Abhishek";
        s1.rollnumber = 161;
        s1.branch = "AIML";
        
        s2.name = "Surya";
        s2.rollnumber = 319;
        s2.branch = "AIML";

        s1.display();
        s1.canRead();
        s1.canWrite();
        s2.display();
        s2.canRead();
        s2.canWrite();
    }
}
