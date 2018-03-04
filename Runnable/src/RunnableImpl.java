
public class RunnableImpl implements Runnable {
	
	private int threadIndex;
	
	

	public RunnableImpl(int threadIndex) {
		this.threadIndex = threadIndex;
	}



	@Override
	public void run() {
		
		int clientNumber = 1;

		while (clientNumber != 100) {
			System.out.println("Server"+this.threadIndex + " send Data to client : " + clientNumber);
			clientNumber++;
		}

	}



	public void start() {
		Thread thread = new Thread(this);
		thread.start();
		
	}

}
