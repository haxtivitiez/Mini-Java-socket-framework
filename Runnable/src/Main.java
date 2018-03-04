
public class Main {

	public static void main(String[] args) {
		
		RunnableImpl runnable1 = new RunnableImpl(1);
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		RunnableImpl runnable2 = new RunnableImpl(2);
		Thread thread2 = new Thread(runnable2, "Server2");
		System.out.println(thread2.getName());
		thread2.start();

		RunnableImpl runnable3 = new RunnableImpl(3);
		runnable3.start();
		
	}

}
