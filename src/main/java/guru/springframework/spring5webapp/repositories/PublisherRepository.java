package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

// Spring data JPA provides the implementation for this at runtime
// Publisher - the model the repository is for
// Long - the type of the model's id
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
