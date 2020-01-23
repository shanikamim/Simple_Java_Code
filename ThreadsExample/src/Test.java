
public class Test {
	public static void main (String args[]) {
		MyThread1 t1 = new MyThread1("Thread 1");
		MyThread2 t2 = new MyThread2();
		
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();
	}
}
