
package interfacepointsexample;

public class MoveablePoint implements Moveable{
    int x, y, xSpeed, ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y=this.y+this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y=this.y-this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x=this.x-this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x=this.x+this.xSpeed;
    }

    @Override
    public String toString() {
        return "(" + "x=" + x + ", y=" + y + ')';
    }
    
    
    
}
