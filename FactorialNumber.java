package lab2;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int n;
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        
        for(int i=1;i<=n;i++){
            sum = sum + (Math.pow(i, 3)/factorial(i));
        }
        
        System.out.println("Output: "+ sum);
    }
    
    private static int factorial(int n){
        int fact=1;
        
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        
        return fact;
    }

}
