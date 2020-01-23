import java.util.Scanner;

public class Test {
	public void method1() throws MyException{
		throw new CustomException("Custom Exception!"); 
	}
	public void method2() throws Exception{
		Test t = new Test();
		t.method1();
	}
	
	public static void main(String arg[])  {
		Test t = new Test();
		try {
			t.method2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("In Finally");
		}
	}
}
