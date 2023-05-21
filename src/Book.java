
public class Book {

	private String name;
	private String author;
	private String publisher;
	private int year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Book(String name, String author, String publisher, int year) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}
	public Book() {
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", year=" + year + "]";
	}
	
	
	
	
}
