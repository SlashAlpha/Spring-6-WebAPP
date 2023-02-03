package slash.code.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import slash.code.spring6webapp.domain.Author;
import slash.code.spring6webapp.domain.Book;
import slash.code.spring6webapp.repositories.AuthorRepository;
import slash.code.spring6webapp.repositories.BookRepository;

import java.util.HashSet;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric=new Author();
        eric.setFirstName("eric");
        eric.setLastName("Evans");


        Book ddd=new Book();
        ddd.setTitle("domain driven design");
        ddd.setIsbn("123456");

        Author rod=new Author();
        eric.setFirstName("rod");
        eric.setLastName("Johnson");

        Book noEJB=new Book();
        ddd.setTitle("J2EE development without EJB");
        ddd.setIsbn("123456");



        Author ericSaved=authorRepository.save(eric);
        Author rodSaved=authorRepository.save(rod);
        Book dddSaved=bookRepository.save(ddd);
        Book noEJBSaved=bookRepository.save(noEJB);



        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJB);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("Data Bootstrap");
        System.out.println("Author count : "+authorRepository.count());
        System.out.println("Book count : "+bookRepository.count());





    }
}
