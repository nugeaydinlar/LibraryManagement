import java.util.Scanner;

public class User {

	Scanner scanner = new Scanner(System.in);
	Library library = new Library();
	Book book1 = new Book("Sefiller", "Victor Hugo", "Is Bankasi", 2000);

	public void add() {

		library.addBook(book1);
	}

	public void delete() {
		System.out.println("Silmek istediginiz kitabin ismi: ");
		String name = scanner.nextLine();
		library.deleteBook(name);
	}

	public void list() {
		library.listBook();
	}

	public void borrow() {
		library.borrowBook();
	}
	
	public void update() {
		library.updateBook();
	}
}
