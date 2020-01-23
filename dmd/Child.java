
package dmd;


public class Child extends Parent{
    public void increment(){
        System.out.println("Value Before: " + a);
        a+=2;
        System.out.println("Value After: " + a);
        System.out.println("Child Class");
    }
}
