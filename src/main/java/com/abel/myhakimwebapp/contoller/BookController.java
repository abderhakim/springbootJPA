package com.abel.myhakimwebapp.contoller;

import com.abel.myhakimwebapp.repoistory.BookRepoitory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    BookRepoitory bookrep;

    public BookController(BookRepoitory bookrep) {
        this.bookrep = bookrep;
    }
@RequestMapping("/books")
   public String getBooks(Model mod) {
        mod.addAttribute("books",bookrep.findAll());
        return "books";

   }
}


