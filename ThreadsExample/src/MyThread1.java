
public class MyThread1 extends Thread {
	String name;

	MyThread1(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + " : " + i);
			/*try {
				this.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}
	}
}
