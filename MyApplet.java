import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
//below is html code written in .java file - used by appletviewer

public class MyApplet extends Applet {
	//override life cycle method
	
	public void init() {
		System.out.println("init....");
		setBackground(Color.green);
	}
	public void start() {
		System.out.println("\tstart....");
	}
	public void stop() {
		System.out.println("\tstop....");
	}
	public void paint(Graphics g) {
		System.out.println("\t\tpaint....");
	}
	public void destroy() {
		System.out.println("destory....");
	}
}
