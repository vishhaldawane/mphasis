import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SomeFileCode {
public static void main(String[] args) {
	System.out.println("Begin");
	//try {
	FileInputStream f ;
	f = new FileInputStream("abc.txt");
	f.close();
	//}
	//catch(FileNotFoundException e) {
	//	System.out.println(e.getMessage());
	//}
	//catch(IOException e) {
	//	System.out.println(e.getMessage());
	//}
	System.out.println("End");
}
}
