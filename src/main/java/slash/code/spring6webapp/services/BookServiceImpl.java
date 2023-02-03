package slash.code.spring6webapp.services;

import org.springframework.stereotype.Service;
import slash.code.spring6webapp.domain.Book;
import slash.code.spring6webapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
