package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

// Spring data JPA provides the implementation for this at runtime
// Book - the model the repository is for
// Long - the type of the model's id
public interface BookRepository extends CrudRepository<Book, Long> {
}
