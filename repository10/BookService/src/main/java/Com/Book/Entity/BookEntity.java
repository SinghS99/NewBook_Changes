package Com.Book.Entity;



import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



import com.sun.istack.NotNull;


@Entity
@Table(name="BOOK")
public class BookEntity {
	@Id
    @Column(name="BOOK_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int book_Id;
	private String title;
	private String category;
	private double price;
	private String author;
	private String publisher;
	private String date;
	private String content;
	private String status;
	private int authorId;
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(int book_Id, String title, String category, double price, String author, String publisher,
			String date, String content, String status, int authorId) {
		super();
		this.book_Id = book_Id;
		this.title = title;
		this.category = category;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.content = content;
		this.status = status;
		this.authorId = authorId;
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		return "BookEntity [book_Id=" + book_Id + ", title=" + title + ", category=" + category + ", price=" + price
				+ ", author=" + author + ", publisher=" + publisher + ", date=" + date + ", content=" + content
				+ ", status=" + status + ", authorId=" + authorId + "]";
	}
	
	
}
