import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileWritingTest {
	public static void main(String[] args) {
		MyFrame mfr1 = new MyFrame("Ping",50,100,100,350,500);
		mfr1.setVisible(true);
	}
}
class MyFrame extends JFrame implements ActionListener { //1 a
	
	JLabel lb1 = new JLabel("Enter filename");
	JTextField filename = new JTextField(20);
	
	JLabel lb2 = new JLabel("Enter filedata");
	JTextArea fileData = new JTextArea(10,25);
	
	JButton jb1  = new JButton("Save");
	JButton jb2  = new JButton("Clear");
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Button is clicked...."+ae.getSource());
		String theFilename = filename.getText(); //got the filename
		String theData = fileData.getText(); //got the file's data
		try {
			FileOutputStream fout = new FileOutputStream(theFilename);
			System.out.println("File is ready for writing...");
			
			byte dataArray[] = theData.getBytes(); //convert into byte array
			System.out.println("Got the files data converted into an array...");
			
			fout.write(dataArray);
			System.out.println("Array is written into the file......");
			
			fout.close();
			System.out.println("File is closed......");
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem 1 :"+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Problem 2 :"+e.getMessage());
		}	
	}
	
	MyFrame(String msg, int d, int x, int y, int l, int b) {
		super(msg);	setLocation(x,y);	setSize(l, b);	
		setLayout(new FlowLayout());	
		add(lb1); add(filename);
		add(lb2); add(fileData);
		add(jb1);
		add(jb2);
		jb2.addActionListener(this);
		jb1.addActionListener(this); //inform JVM that jb1 is registered
	}						//for event handling 
	
}