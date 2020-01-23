package Array;

import java.util.Scanner;

/**
 *
 * @author Shanzida Anika Mim
 */
public class ArrayMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        // ****** 1D ARRAY ******
        int arr[]=new int[size];
        // *** Taking input into the array ***
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // *** Print the array ***
        for(int num : arr){
            System.out.print(num+" ");
        }
        // *** Find Sum ***
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("\nSum : "+sum);
        
        // *** Find Max ***
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max : "+max);
        
        // ****** 2D ARRAY ******

        int arr2d[][] = { {1,2,3}, {4,5,6} };


    }
}
