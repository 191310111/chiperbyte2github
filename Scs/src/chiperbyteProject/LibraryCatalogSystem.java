package chiperbyteProject;
import java.util.List;
import java.util.Scanner;

public class LibraryCatalogSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Catalog System");
            System.out.println("1. Add a book");
            System.out.println("2. Search books by title");
            System.out.println("3. Search books by author");
            System.out.println("4. List all books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;

                case "2":
                    System.out.print("Enter the title to search for: ");
                    title = scanner.nextLine();
                    List<Book> titleResults = library.searchBooksByTitle(title);
                    if (!titleResults.isEmpty()) {
                        System.out.println("\nSearch Results:");
                        titleResults.forEach(System.out::println);
                    } else {
                        System.out.println("No books found with that title.");
                    }
                    break;

                case "3":
                    System.out.print("Enter the author to search for: ");
                    author = scanner.nextLine();
                    List<Book> authorResults = library.searchBooksByAuthor(author);
                    if (!authorResults.isEmpty()) {
                        System.out.println("\nSearch Results:");
                        authorResults.forEach(System.out::println);
                    } else {
                        System.out.println("No books found by that author.");
                    }
                    break;

                case "4":
                    List<Book> books = library.listBooks();
                    if (!books.isEmpty()) {
                        System.out.println("\nList of Books:");
                        books.forEach(System.out::println);
                    } else {
                        System.out.println("No books in the library.");
                    }
                    break;

                case "5":
                    System.out.println("Exiting the Library Catalog System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
