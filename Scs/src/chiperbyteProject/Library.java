package chiperbyteProject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Library {
	    private List<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added: " + book);
	    }

	    public List<Book> searchBooksByTitle(String title) {
	        return books.stream()
	                    .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
	                    .collect(Collectors.toList());
	    }

	    public List<Book> searchBooksByAuthor(String author) {
	        return books.stream()
	                    .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
	                    .collect(Collectors.toList());
	    }

	    public List<Book> listBooks() {
	        return books;
	    }
	}


