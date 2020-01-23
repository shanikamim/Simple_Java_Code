package dmd;

public class Parent {
    int a;
    public void increment() {
        System.out.println("Value Before: " + a);
        a++;
        System.out.println("Value After: " + a);
        System.out.println("Parent Class");
    }
}
