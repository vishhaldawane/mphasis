import java.util.HashSet;
import java.util.Iterator;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Book b1 = new Book("The Autobiography Of A Yogi","SS P Yogananda",1,950,125.00f);
		Book b2 = new Book("Creating Affluence","Deepak Chopra",1,100,850.00f);
		Book b3 = new Book("Synchrodestiny","Deepak Chopra",1,1200,750.00f);
		Book b4 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b5 = new Book("The Bhagvad Geetha","Krishna Bhagwan",1,1800,250.00f);
		Book b6 = new Book("The Second Christ","SS P Yogananda",1,1050,650.00f);
		System.out.println("Books are ready...");
		
		HashSet<Book> myBookShelf = new HashSet<Book>();
		System.out.println("Book Shelf is ready.....");
		
		myBookShelf.add(b1);
		myBookShelf.add(b2);
		myBookShelf.add(b3);
		myBookShelf.add(b4);
		myBookShelf.add(b5);
		myBookShelf.add(b6);
		System.out.println("Books are added....to the shelf....");
		
		
		Iterator<Book> iter = myBookShelf.iterator();
		System.out.println("Accessing the shelf.....");
		
		while(iter.hasNext()) {
			Book theBook = iter.next();
			System.out.println("Book : "+theBook);
		}
		
		
		
		
		
	}
}

class Book
{
	String bookName;
	String authorName;
	int edition;
	int numberOfPages;
	float bookPrice;
	
	Book(String bookName, String authorName, int edition, int numberOfPages, float bookPrice) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", edition=" + edition + ", numberOfPages="
				+ numberOfPages + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
