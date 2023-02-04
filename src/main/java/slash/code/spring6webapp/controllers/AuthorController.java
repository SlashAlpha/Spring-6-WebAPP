package slash.code.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import slash.code.spring6webapp.services.AuthorService;
import slash.code.spring6webapp.services.GreetingService;
import slash.code.spring6webapp.services.GreetingServiceImpl;

@Controller
public class AuthorController {

    AuthorService authorService;
    GreetingService greetingService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
        this.greetingService = new GreetingServiceImpl();
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors",authorService.findAll());
        return "authors";

    }
    public String sayHi(){
        return greetingService.sayGreetings();
    }
}
