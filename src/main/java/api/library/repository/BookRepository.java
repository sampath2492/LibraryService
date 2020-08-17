package api.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.library.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

}
