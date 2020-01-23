
package abstractshapeexample;

public class AbstractShapeExample {

    public static void main(String[] args) {
        Shape s = new Circle(5, "Black", true);
        System.out.println("Area:"+s.getArea());
        System.out.println("Perimeter:"+s.getPeri());
    }
    
}
