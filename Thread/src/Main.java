
public class Main {

	public static void main(String[] args) {


		ServerThread thread1 = new ServerThread("Server#1");
//		ServerThread thread2 = new ServerThread("Server#2");
		System.out.println("MAIN");
//		thread2.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(thread2.getName() + ": Priority --> " + thread2.getPriority());
		thread1.start();
//		thread2.start();

	}

}
