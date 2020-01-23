
package abstractshapeexample;


public class Circle extends Shape{
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean isFilled){
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea(){
        return (Math.PI*radius*radius);
    }
    @Override
    double getPeri(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }   
}
