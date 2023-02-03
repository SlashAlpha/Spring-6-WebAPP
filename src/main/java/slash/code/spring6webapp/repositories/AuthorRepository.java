package slash.code.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import slash.code.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
