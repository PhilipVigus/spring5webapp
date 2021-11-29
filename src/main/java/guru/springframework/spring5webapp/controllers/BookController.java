package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        /**
         * Add a 'books' attribute to the model and assign the set
         * of all books to it. The model then gets passed to a 'books'
         * view
         */
        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
