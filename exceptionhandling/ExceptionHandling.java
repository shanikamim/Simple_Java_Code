
package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            //1. We cannot write super classes of exception in catches before subclasses
//        try{
//            //ArrayIndexOutOfBoundsException
//            int a[]=new int[5];
//            a[6]=10;
//            System.out.println("It is displayed !");
//            //ArithmeticException
//            int x=5,y=0;
//            System.out.println("Division:"+(x/y));          
//            //NullPointerException
//            String s=null;
//            System.out.println("Char at: "+s.charAt(0));
//            //StringIndexOutOfBoundsException
//            String s2="Sadman";
//            System.out.println("Char at: "+s2.charAt(10));
//            //NumberFormatException
//            int z=Integer.parseInt("CSE");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException: Index should be less than 5");
//        }
//        catch(NullPointerException e){
//            System.out.println("NullPointerException: String null");
//        }
//        catch(StringIndexOutOfBoundsException e){
//            System.out.println("StringIndexOutOfBoundsException: String Index out of bounds");
//        }
//        catch(ArithmeticException e){
//            System.out.println("ArithmeticException: Division by zero");
//        }
//        catch(NumberFormatException e){
//            System.out.println("NumberFormatException: Input string cannot be converted to int");
//        }
//        catch(Exception e){
//            System.out.println("Exception occured : "+e);
//        }
//        finally{
//            System.out.println("This is finally block !");
//        }
            
            // **** CUSTOM EXCEPTION ****
            Person p = new Person("Sadman", -25);
            } catch (CustomException ex) {
                System.out.println("Exception occured ! "+ex);
            }
    }
}
