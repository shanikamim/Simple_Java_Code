
package pkginterface;


public class RacingCar implements Vehicle {

    int speed = 10;
    public void increaseSpeed() {
       speed = speed +3;
    }

    public void decreaseSpeed() {
        speed = speed -3;
    } 
}
