package api.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue
	private int libraryID;
	private String libraryName;
	
	public int getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(int libraryID) {
		this.libraryID = libraryID;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	
}
