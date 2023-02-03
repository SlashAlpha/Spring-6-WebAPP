package slash.code.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import slash.code.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
