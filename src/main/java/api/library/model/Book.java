package api.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private int bookID;
	private String bookName;
	private String bookAuthor;
	private int bookLibraryID;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookLibraryID() {
		return bookLibraryID;
	}
	public void setBookLibraryID(int bookLibraryID) {
		this.bookLibraryID = bookLibraryID;
	}

}
