
package interfacepointsexample;

public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius; 
        center = new MoveablePoint(x, y, xSpeed, ySpeed);       
    }
    
    @Override
    public void moveUp() {
        center.y=center.y+center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y=center.y-center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x=center.x-center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x=center.x+center.xSpeed;
    }

    @Override
    public String toString() {
        return "{" + "radius=" + this.radius + ", center=" + center + '}';
    }
    
}
