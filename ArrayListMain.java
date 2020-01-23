package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shanzida

 */
public class ArrayListMain {
    public static void main(String args[]){
        // Non-generic arraylist
        ArrayList arrayList=new ArrayList();
        arrayList.add("SEU");
        arrayList.add(1);
        arrayList.add("CSE");
        arrayList.add(2);
        arrayList.remove(2);        
        for(Object obj : arrayList){
            System.out.print(obj+ " ");
        }
        
        // Gernric ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("\nEnter 5 elements:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int data=sc.nextInt();
            al.add(data);
        }
        System.out.println("ArrayList Size: "+al.size());
        al.remove(0);
        System.out.println("ArrayList Size: "+al.size());
    }
}
