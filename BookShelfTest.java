import java.util.HashSet;
import java.util.Iterator;

public class BookShelfTest {
	public static void main(String[] args) {
	//this is a comment added
	//by vishhal
		/*Book b1 = new Book("The Autobiography Of A Yogi","SS P Yogananda",1,950,125.00f);
		Book b2 = new Book("Creating Affluence","Deepak Chopra",1,100,850.00f);
		Book b3 = new Book("Synchrodestiny","Deepak Chopra",1,1200,750.00f);
		Book b4 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b5 = new Book("The Bhagvad Geetha","Krishna Bhagwan",1,1800,250.00f);
		Book b6 = new Book("The Second Christ","SS P Yogananda",1,1050,650.00f);
		
		Book b7 = new Book("The Autobiography Of A Yogi","SS P Yogananda",1,950,125.00f);
		Book b8 = new Book("The Autobiography Of A Yogi","SS P Yogananda",1,950,125.00f);
		
		
		11:45
		*/
		
		Book b1 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b2 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b3 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b4 = new Book("The Java Programming Language","James Gosling",4,1100,1251.00f);
		Book b5 = new Book("The Java Programming Language","James Gosling",4,1000,1250.00f);
		Book b6 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b7 = new Book("The Java Programming Language","James Gosling",4,1100,1250.00f);
		Book b8 = new Book("The Java Programming Language","Ken Arnold",4,1100,1250.00f);
		
		Book b9 = b1;
		Book b10 = b1;
		
		
		System.out.println("b1 hashCode "+b1.hashCode());
		System.out.println("b2 hashCode "+b2.hashCode());
		System.out.println("b3 hashCode "+b3.hashCode());
		System.out.println("b4 hashCode "+b4.hashCode());
		System.out.println("b5 hashCode "+b5.hashCode());
		System.out.println("b6 hashCode "+b6.hashCode());
		System.out.println("b7 hashCode "+b7.hashCode());
		System.out.println("b8 hashCode "+b8.hashCode());
		System.out.println("b9 hashCode "+b9.hashCode());
		System.out.println("b10 hashCode "+b10.hashCode());
		
		System.out.println("Books are ready...");
		
		HashSet<Book> myBookShelf = new HashSet<Book>();
		System.out.println("Book Shelf is ready.....");
		
		myBookShelf.add(b1);
		myBookShelf.add(b1); //its the same memory address 
		myBookShelf.add(b1); //its the same memory address 
		
		myBookShelf.add(b2);
		myBookShelf.add(b2); //its the same memory address 
		myBookShelf.add(b2); //its the same memory address 
		
		
		myBookShelf.add(b3);
		myBookShelf.add(b4);
		myBookShelf.add(b5);
		myBookShelf.add(b6);
		
		myBookShelf.add(b7); //its the new memory address (but content is same as b1) 
		myBookShelf.add(b8); //its the new memory address (but content is same as b1)
		myBookShelf.add(b9); //its the new memory address (but content is same as b1)
		myBookShelf.add(b10); //its the new memory address (but content is same as b1)
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + Float.floatToIntBits(bookPrice);
		result = prime * result + edition;
		result = prime * result + numberOfPages;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		
		if (authorName == null) {
			if (other.authorName != null)
				return false;
			
		} else if (!authorName.equals(other.authorName))
			return false;
		
		
		if (bookName == null) {
			if (other.bookName != null)
				return false;
			
		} else if (!bookName.equals(other.bookName))
			return false;
		
		
		if (Float.floatToIntBits(bookPrice) != Float.floatToIntBits(other.bookPrice))
			return false;
		
		if (edition != other.edition)
			return false;
		
		if (numberOfPages != other.numberOfPages)
			return false;
		
		
		return true;
	}

	
	
	
	
	
}
