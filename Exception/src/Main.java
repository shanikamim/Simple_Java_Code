import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		int i;
		int array[]  = {1,2,3,4,5};
		int b=3,a=0;
		try {
			String st= null;
			System.out.println(st.charAt(4));
			a=array[6];
			b=b/a;
			System.out.println("Correct");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index ... Error!!!");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Error!!!");
		}
		catch(Exception e) {
			System.out.println("Super!!!");
		}finally {
			System.out.println("Final Codes");
		}
		
		System.out.println("Hello Class");
		
	}
}
