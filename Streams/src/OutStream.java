import java.io.*;


public class OutStream {

	public static void main(String[] args) {
		
	try {
		FileOutputStream  outPutStream = new FileOutputStream("example2.txt",true);
		
		char H = 'H';
		
		outPutStream.write((char)H);
		
		String text = "Hello Java Network Programming";
		
		outPutStream.write(text.getBytes());
		
		outPutStream.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
