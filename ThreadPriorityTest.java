import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadPriorityTest {
	public static void main(String[] args) {
		CounterFrame mfr1 = new CounterFrame("MIN",50,100,100,250,100);
		CounterFrame mfr2 = new CounterFrame("NORM",50,350,100,250,100);
		CounterFrame mfr3 = new CounterFrame("MAX",50,650,100,250,100);
		
		Thread t1 = new Thread(mfr1);
		Thread t2 = new Thread(mfr2);
		Thread t3 = new Thread(mfr3);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		mfr1.setVisible(true);
		mfr2.setVisible(true);
		mfr3.setVisible(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class CounterFrame extends JFrame implements Runnable { //1 a
	String message;	int delay;	JTextField tf = new JTextField(20);
	
	CounterFrame(String msg, int d, int x, int y, int l, int b) {
		super(msg);	message = msg;	delay = d;setLocation(x,y);	setSize(l, b);	
		setLayout(new FlowLayout());	add(tf);
	}
	public void run() { // step 2  b
		for(int i=1;i<=2000;i++) { tf.setText(message+" "+i);
			try{ Thread.sleep(delay); } catch(InterruptedException e) {}
		}
	}
}