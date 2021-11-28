package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// Spring data JPA provides the implementation for this at runtime
// Author - the model the repository is for
// Long - the type of the model's id
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
