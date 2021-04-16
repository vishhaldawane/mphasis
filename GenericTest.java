public class GenericTest {
	public static void main(String[] args) {
		
		MyIntegers mi = new MyIntegers(10,20);
		mi.print();
		mi.swap();
		mi.print();
		
		System.out.println("----------------------");
		
		MyFloats mf = new MyFloats(10.4f, 20.5f);
		mf.print();
		mf.swap();
		mf.print();
		
		System.out.println("----------------------");
		
		MyStrings ms = new MyStrings("Jack","Julie");
		ms.print();
		ms.swap();
		ms.print();
		
		System.out.println("----------------------");
		
		Song s1 = new Song("Tanhayee","Dil Chahta Hai","Sonu Nigam",2003);
		Song s2 = new Song("Pirindhaai","Adithya Varma","Sid Sriram",2020);
		
		MySongs mss = new MySongs(s1,s2);
		mss.print();
		mss.swap();
		mss.print();
	}
}

class MyIntegers
{
	int x;	
	int y;
	
	MyIntegers(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		int temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}
class MyFloats
{
	float x;	
	float y;
	
	MyFloats(float x, float y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		float temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class MyStrings
{
	String x;	
	String y;
	
	MyStrings(String x, String y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		String temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class MySongs
{
	Song x;	
	Song y;
	
	MySongs(Song x, Song y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		System.out.println("Swapping...");
		Song temp;
		temp = x ;
		x = y;
		y = temp;
		System.out.println("Swapped...");
	}
	void print() {
		System.out.println("x "+x);	
		System.out.println("y "+y);
	}
}

class Song
{
	String title;
	String album;
	String artist;
	int year;
	
	Song(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
}


