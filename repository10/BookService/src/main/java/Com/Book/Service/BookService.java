package Com.Book.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Book.Dao.BookRepo;
import Com.Book.Entity.BookEntity;
import Com.Book.Exception.NoSuchBookExistsException;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;

	public BookEntity createbook(BookEntity book) {
		return bookRepo.save(book);
	}

	public List<BookEntity> savebooks(List<BookEntity> books) {
		return bookRepo.saveAll(books);
	}

	public List<BookEntity> getBooks() {
		return bookRepo.findAll();
	}

	public BookEntity getBookById(int book_Id) {
		// return bookRepo.findById(book_Id).orElse(null);

		return bookRepo.findById(book_Id)
				.orElseThrow(() -> new NoSuchBookExistsException("NO BOOK PRESENT WITH ID = " + book_Id));
	}

	public Optional<BookEntity> deleteBook(BookEntity book, int book_Id) {
		book.setBook_Id(book_Id);
		Optional<BookEntity> existingbook = bookRepo.findById(book.getBook_Id());
		if (existingbook.isPresent()) {
			bookRepo.deleteById(book_Id);
		} else {

			throw new NoSuchBookExistsException("NO BOOK PRESENT WITH ID = " + book_Id);
		}
		return existingbook;
	}

	/*public BookEntity updateBook(BookEntity book, int book_Id) {
		// TODO Auto-generated method stub
		book.setBook_Id(book_Id);
		BookEntity existingbook = bookRepo.findById(book.getBook_Id())
				.orElseThrow(() -> new NoSuchBookExistsException("NO BOOK PRESENT WITH ID = " + book_Id));
		existingbook.setBook_Id(book.getBook_Id());
		existingbook.setAuthor(book.getAuthor());
		existingbook.setTitle(book.getTitle());
		existingbook.setCategory(book.getCategory());
		existingbook.setPrice(book.getPrice());
		existingbook.setPublisher(book.getDate());
		existingbook.setContent(book.getContent());
		existingbook.setStatus(book.getStatus());
		existingbook.setAuthorId(book.getAuthorId());

		return bookRepo.save(existingbook);
	}*/
	public BookEntity updateBook(BookEntity book)  {
		if (bookRepo.existsById(book.getBook_Id())) {
			
			return bookRepo.save(book);
		}else {
			throw new NoSuchBookExistsException("NO BOOK PRESENT WITH ID = " + book.getBook_Id());
		}
		

}
}