package slash.code.spring6webapp.services;

import slash.code.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();


}
