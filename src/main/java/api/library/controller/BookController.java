package api.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.library.model.Book;
import api.library.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/library/saveBook")
	public void saveBook(@RequestBody Book book)
	{
		bookService.save(book);
		
	}
	@GetMapping(value="/library/getBooksList",produces="application/json")
	public List<Book> getBooksList(@RequestParam(value="libraryID",required=true) int libraryID)
	{
		List<Book> booksList=new ArrayList<Book>();
		booksList = bookService.getBooksList(libraryID);
		return booksList;
	}

}
