package dmd;


public class Test {
    public static void main(String Ar[]){
        Parent p = new Parent();
        Child c = new Child();
        c.a=11;
        p.a = 4;
        p.increment();
        System.out.println(p);
        p = c;
        System.out.println(c);
        System.out.println(p);
        p.increment();
    }
}
