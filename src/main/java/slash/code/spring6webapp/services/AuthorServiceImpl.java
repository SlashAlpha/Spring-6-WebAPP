package slash.code.spring6webapp.services;

import slash.code.spring6webapp.domain.Author;
import slash.code.spring6webapp.repositories.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
