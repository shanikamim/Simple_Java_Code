
package interfacepointsexample;

public class InterfacePointsExample {

    public static void main(String[] args) {
        System.out.println("Point Moving");
        Moveable moveable = new MoveablePoint(2, 2, 2, 1);
        System.out.println(moveable.toString());
        moveable.moveLeft();
        moveable.moveDown();
        System.out.println(moveable.toString());
        
        System.out.println("Circle Moving");
        moveable = new MoveableCircle(2, 2, 2, 1,5);
        System.out.println(moveable.toString());
        moveable.moveLeft();
        moveable.moveDown();
        System.out.println(moveable.toString());
    }
    
}
