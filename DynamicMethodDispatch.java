class Shape {
    void draw() {
        System.out.println("Draw shape");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }    
}
