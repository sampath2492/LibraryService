package api.library.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.library.model.Library;
import api.library.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	LibraryRepository repository;
	
	public List<Library> getAllLibraries() {
		final List<Library> list = new ArrayList<Library>();
		repository.findAll().forEach(library -> list.add(library));
		return list;
	}

	public void save(Library library) {
		repository.save(library);
	}

}
