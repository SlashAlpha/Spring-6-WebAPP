package slash.code.spring6webapp.services;

import slash.code.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
