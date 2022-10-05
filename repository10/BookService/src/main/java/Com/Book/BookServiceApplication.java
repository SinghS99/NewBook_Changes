package Com.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Com.Book.Service.BookService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;



@SpringBootApplication
@OpenAPIDefinition()
public class BookServiceApplication implements CommandLineRunner {
	@Autowired
	private BookService service;

	@Override
	public void run(String... args) throws Exception {

		/*service.saveBook(new Book("Superman", "Comic", 90, "Tony", "ReadVision Publisher", "Comic Book", "Active", 1));
		service.saveBook(new Book("Harry Potter", "Comic", 150, "J. K. Rowling", "Bloomsbury Publishing", "Comic Book",
				"Active", 2));
		service.saveBook(new Book("Twilight", "Comic", 129, "Stephenie Meyer", "Little, Brown and Company",
				"Comic Book", "Active", 3));
		service.saveBook(new Book("Fairy Tale", "Comic", 160, "Stephen King", "Scribner", "Dark Fantasy", "Active", 4));
*/
	}
 

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
