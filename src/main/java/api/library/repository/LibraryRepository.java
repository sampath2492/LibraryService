package api.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.library.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library,Integer>{

}
