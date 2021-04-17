import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fin = new FileInputStream("D:\\JAVATRAINING\\java\\java.txt");
		
			System.out.println("File is ready to read....");
		
			byte b = (byte) fin.read(); //read the first letter
			while(b!=-1) // check the EOF (end of file)
			{
				System.out.print((char)b);
				b = (byte) fin.read(); //read successive letters
				Thread.sleep(100);
			}
			fin.close(); //close the file
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem1 : "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Problem2 : "+e.getMessage());
		}
		catch(InterruptedException e) {
			System.out.println("Problem3 : "+e.getMessage());
		}
	}
}
