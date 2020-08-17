package api.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import api.library.model.Library;
import api.library.services.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@PostMapping(value="/library/saveLibrary")
	public void saveLibrary(@RequestBody Library library){
		libraryService.save(library);
	}
	
	@GetMapping(value="/library/getAllLibraries",produces="application/json")
	public List<Library> getAllLibraries(){
		List<Library> libraryList = new ArrayList<Library>();
		libraryList = libraryService.getAllLibraries();
		return libraryList;
	}
}
