
public class ServerThread extends Thread {

	public ServerThread(String threadName) {
		this.setName(threadName);
	}

	@Override
	public void run() {

		try {
			int clientNumber = 1;

			while (clientNumber != 100) {
				System.out.println( this.getName()+" send Data to client : " + clientNumber);
				Thread.sleep(1000);
				clientNumber++;
			}
		} catch (Exception ecx) {
			ecx.printStackTrace();
		}

	}

}
