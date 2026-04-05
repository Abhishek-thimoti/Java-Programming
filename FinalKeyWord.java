final class Shape{
    final double PI = 3.14;
    final void showPi(){
        System.out.println("Value of PI: " + PI);
    }
}
class Circle extends Shape {
    void showPi() {
        PI = 3.14159;
        System.out.println("Values of PI: " + PI);
    }
    void calulateArea(double radius){
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class FinalKeyWord {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.showPi();
        c.calulateArea(5);
    }
}