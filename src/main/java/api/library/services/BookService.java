package api.library.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.library.model.Book;
import api.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public void save(Book book) {
		repository.save(book);
	}

	public List<Book> getBooksList(int libraryID) {
		final List<Book> list = new ArrayList<Book>();
		List<Book> bookList = new ArrayList<Book>();
		repository.findAll().forEach(book -> list.add(book));
		if(list.size()>0){
			bookList = list.stream().filter(b -> b.getBookLibraryID()==libraryID).collect(Collectors.toList());
		}
		return bookList;
	}

}
