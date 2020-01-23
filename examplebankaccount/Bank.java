package examplebankaccount;
public class Bank {
    private String name, location;
    private int numOfBranches;

    public Bank(String name, String location, int numOfBranches) {
        this.name = name;
        this.location = location;
        this.numOfBranches = numOfBranches;
    }
    
    public Bank(Bank ob){
        this.name=ob.name;
        this.location=ob.location;
        this.numOfBranches=ob.numOfBranches;
    }

    @Override
    public String toString() {
        return "Bank{" + "name=" + name + ", location=" + location + ", numOfBranches=" + numOfBranches + '}';
    }
    
}
