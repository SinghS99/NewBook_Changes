package Com.Book.Controller;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Com.Book.Dao.BookRepo;
import Com.Book.Entity.BookEntity;
import Com.Book.Service.BookService;

@RestController
@RequestMapping("/api/v1/digitalbooks")
public class BookController {
	  @Autowired
	  private BookService bookservice;

	    @PostMapping("/create")
	    public BookEntity addBook(@RequestBody BookEntity book) {
	        return bookservice.createbook(book);
	    }

	    @PostMapping("/createlistBooks")
	    public List<BookEntity> addBooks(@RequestBody List<BookEntity> books) {
	        return bookservice.savebooks(books);
	    }

	    @GetMapping("/getbooks")
	    public ResponseEntity<List<BookEntity>> findAllBooks() {
	    	
	        List<BookEntity> list=bookservice.getBooks();
	        if(list.size()<=0) {
	        	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }
	        return ResponseEntity.of(Optional.of(list));
	    }

	    @GetMapping("/bookById/{book_Id}")
	    public ResponseEntity<BookEntity> findBookById(@PathVariable int book_Id) {
	    	
	    	BookEntity book= bookservice.getBookById(book_Id);
	        if(book==null) {
	        	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	     
	        }
	        return ResponseEntity.of(Optional.of(book));
	    }

	  
	    @PutMapping("/update")
	    public BookEntity updateBook(@RequestBody BookEntity book)
	    {
	        return bookservice.updateBook(book);
	    }
	    
	    @DeleteMapping("/delete/{book_Id}")
	    public Optional<BookEntity> deleteBook(@RequestBody BookEntity book,@PathVariable("book_Id") int book_Id) {
	        return bookservice.deleteBook(book, book_Id);
	    }
	    
	 

}
