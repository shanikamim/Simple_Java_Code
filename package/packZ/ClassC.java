
package packZ;

public class ClassC extends packX.ClassA{

    @Override
    public void compute() {
        if(getA()<getB()){
            System.out.println(getA());
        }
        else{
            System.out.println(getB());
        }
    }
    
}
