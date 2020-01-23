/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Shanzida
 */
public class Lab1 {

    public static void main(String[] args) {
          System.out.println("Hello World !");
        //INPUT FROM CONSOLE        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a string");
        String b=sc.nextLine();
        System.out.println(" " +b);

        System.out.println("Enter a long");
        long a=sc.nextLong();
        System.out.println(" " +a);

        System.out.println("Enter a int");
        int  x=sc.nextInt();
        System.out.println(" " +x);

        System.out.println("Enter a float");
        float y=sc.nextFloat();
        System.out.println(" " +y);

        System.out.println("Enter a Double");
        double z=sc.nextDouble();
        System.out.println(" " +z);
        
        //LOOPS
        
          //While Loop
//        int x = 1;
//        while( x < 10 ) {
//           System.out.print("value of x : " + x );
//           x++;
//           System.out.print("\n");
//        }
//        
          //Do while Loop
//        do {
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//         }while( x < 10 );
        
          //For each loop
//            int [] numbers = {10, 20, 30, 40, 50};
//            for(int x : numbers ) {
//               System.out.print( x );
//               System.out.print(",");
//            }
        
    }
    
}
