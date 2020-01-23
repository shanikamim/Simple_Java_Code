package packY;
import packX.ClassA;
public class ClassB extends ClassA{
    @Override
    public void compute() {
        if(getA()>getB()){
            System.out.println(getA());
        }
        else{
            System.out.println(getB());
        }
    }
    
}
