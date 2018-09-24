package com.abel.myhakimwebapp.contoller;

import com.abel.myhakimwebapp.repoistory.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    BookRepository bookrep;

    public BookController(BookRepository bookrep) {
        this.bookrep = bookrep;
    }
@RequestMapping("/books")
   public String getBooks(Model mod) {
        mod.addAttribute("books",bookrep.findAll());
        return "books";

   }
}


