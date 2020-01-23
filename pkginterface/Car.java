
package pkginterface;


public class Car implements Vehicle,Transport {
 
    public int speed = 10;
    int passengers=3;
    public void increaseSpeed() {
        speed++;
    }
    public void decreaseSpeed() {
        speed--;
    }
    public void takePassenger(int howMany) {
        passengers+=howMany;
    }
    public void dropPassenger(int howMany) {
        passengers-=howMany;
    }
    public void increaseSpeed(int howMuch) {
       speed+=howMuch;
    }
 
}
