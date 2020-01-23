package packX;
public abstract class ClassA {
    private double a,b; 
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void set(double a, double b){
        this.a=a;
        this.b=b;
    }
    public abstract void compute();
}
