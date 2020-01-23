package packM;
import packX.ClassA;
import packY.ClassB;
import packZ.ClassC;
import packW.ClassD;
public class PackagesExample {
    public static void main(String[] args) {
        ClassA ob = new ClassB();
        ob.set(10, 20);
        ob.compute();
        
        ob=new ClassC();
        ob.set(20, 10);
        ob.compute();
        
        ob=new ClassD();
        ob.set(20, 10);
        ob.compute();
    }
    
}
