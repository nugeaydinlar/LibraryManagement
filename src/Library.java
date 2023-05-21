import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	Scanner scanner = new Scanner(System.in);
	Giveback giveback = new Giveback();
	String borrowList[] = new String[2];

	ArrayList<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public void deleteBook(String bookName) {

		
		boolean temp = books.remove(bookName);
		try {
			if (temp == false) {
				throw new BookNotFoundException("Kitap bulunamadi");
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void updateBook() {
		System.out.println("Guncelleme yapildi");
	}

	public void listBook() {
		try {

			if (books.isEmpty())
				throw new ListEmptyException("Listeniz bos");

			for (Book book : books) {
				System.out.println(book);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void borrowBook() {
		
		
		System.out.println("Odunc almak istediginiz kitap");
		String borrowName = scanner.nextLine();
		boolean flag = false;

		try {
			for (Book book : books) {
				if (borrowName.equals(book.getName())) {
					flag = true;
				}

			}

			if (flag == false)
				throw new BookNotFoundException("Odunc almak istediginiz kitap bulunamadi");

			System.out.println("Kitap odunc alindi");
			
			if(borrowList.length == 2) {
				throw new BookLimitExceededException("Siniri astiniz");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void givebackBook() {
		System.out.println("Kitap iade edildi");
	}
}
