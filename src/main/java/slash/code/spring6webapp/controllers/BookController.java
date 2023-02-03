package slash.code.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import slash.code.spring6webapp.services.BookService;

@Controller
public class BookController {

    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public String getBooks(Model model){
        model.addAttribute("books",bookService.findAll());

        return "books";
    }
}
