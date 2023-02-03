package slash.code.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import slash.code.spring6webapp.domain.Author;
import slash.code.spring6webapp.domain.Book;
import slash.code.spring6webapp.domain.Publisher;
import slash.code.spring6webapp.repositories.AuthorRepository;
import slash.code.spring6webapp.repositories.BookRepository;
import slash.code.spring6webapp.repositories.PublisherRepository;

import java.util.HashSet;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric=new Author();
        eric.setFirstName("eric");
        eric.setLastName("Evans");
        Author ericSaved=authorRepository.save(eric);
        Book ddd=new Book();
        ddd.setTitle("domain driven design");
        ddd.setIsbn("123456");
        ddd.getAuthors().add(ericSaved);
        Book dddSaved=bookRepository.save(ddd);
        Author rod=new Author();
        rod.setFirstName("rod");
        rod.setLastName("Johnson");
        Author rodSaved=authorRepository.save(rod);
        Book noEJB=new Book();
        noEJB.setTitle("J2EE development without EJB");
        noEJB.setIsbn("123456");
        noEJB.getAuthors().add(rodSaved);
        Book noEJBSaved=bookRepository.save(noEJB);



        Publisher glenat=new Publisher();
        glenat.setPublisherName("Glenat");
        glenat.setAddress("8 rue des moulinaux");
        glenat.setCity("Paris");
        glenat.setState("ile de france");
        glenat.setZipcode("75000");
        Publisher glenatSaved=publisherRepository.save(glenat);


        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJB);
        glenatSaved.getBooks().add(ddd);
        glenatSaved.getBooks().add(noEJBSaved);
        noEJBSaved.setPublisher(glenatSaved);
        dddSaved.setPublisher(glenatSaved);


        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);
        publisherRepository.save(glenatSaved);




        System.out.println("Data Bootstrap");
        System.out.println("Author count : "+authorRepository.count());
        System.out.println("Book count : "+bookRepository.count());
        System.out.println(glenatSaved.getPublisherName()+"'s book : "+glenatSaved.getBooks().stream().count());
        System.out.println(dddSaved.getTitle());
        System.out.println();






    }
}
