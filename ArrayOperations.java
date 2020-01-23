
package ArrayOperations;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String args[]){
        int data[]=new int [100];
        int size;
        Scanner sc = new Scanner(System.in);
        // *** Taking input into the array ***
        System.out.println("Enter array size:");
        size=sc.nextInt();
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            data[i]=sc.nextInt();
        }
        //Insert into Array
        int insert_index,insert_value;
        System.out.println("Enter a value to insert:");
        insert_value = sc.nextInt();
        System.out.println("Enter an index to insert into:");
        insert_index = sc.nextInt();
        for(int i=size-1;i>=insert_index;i--){
            data[i+1]=data[i];
        }
        data[insert_index]=insert_value;
        size++;
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        } 
        
        //Delete from array (index)
        int delete_index;
        System.out.println("\nEnter an index to delete from:");
        delete_index = sc.nextInt();
        for(int i=delete_index;i<size;i++){
            data[i]=data[i+1];
        }
        size--;
        for(int i=0;i<size;i++){
            System.out.print(data[i]+ " ");
        }

        //Delete from array (value)
        int deleteValue,index=0;
        System.out.println("\nEnter an value to delete:");
        deleteValue = sc.nextInt();
        for(int i=0;i<size;i++){
            if(deleteValue != data[i]){
                data[index]=data[i];
                index++;
            }
            else{
                continue;
            }
        }
        size=index;
        for(int i=0;i<size;i++){
            System.out.print(data[i]+ " ");
        }
    }

}
