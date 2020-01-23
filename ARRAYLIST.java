
package arraylist;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;


public class ARRAYLIST {

    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        ArrayList<Integer> num2=new ArrayList<Integer>();
        //ArrayList Size
        System.out.println(num.size());
        //Adding element
        for(int i=0;i<=10;i++)
            num.add(i);
        //Display ArrayList
        System.out.println(num);
//        for (Integer num1 : num) {
//            System.out.println(num1);
//        }
          //Traversing list through Iterator  
//        Iterator itr=num.iterator();  
//        while(itr.hasNext()){  
//         System.out.println(itr.next());  
//        }  
        
        //Remove
        num.remove(5);
        num.remove(1);      
        System.out.println(num);

        //set
        num.set(0, 2);
        System.out.println(num);

        //get
        System.out.println("get():"+num.get(0));
        //cotains
        boolean b=num.contains(-5);
        System.out.println("Contains:"+b);
        //indexOf
        System.out.println("First Occur:"+num.indexOf(2));
        //lastIndexOf
        System.out.println("Last Occur:"+num.lastIndexOf(2));
        //clone
        num2=(ArrayList<Integer>) num.clone();
        //clear
        num2.clear();
        //equals
        if(num2.equals(num)) System.out.println("Equal");
        else System.out.println("Not Equal");
        
        System.out.println("Num:"+num.size());
        System.out.println("Num2:"+num2);
    }
    
}
