package com.abel.myhakimwebapp.contoller;

import com.abel.myhakimwebapp.repoistory.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    AuthorRepository authrep;

    public AuthorController(AuthorRepository authrep) {
        this.authrep = authrep;
    }
@RequestMapping("/authors")
   public String getBooks(Model mod) {
        mod.addAttribute("authors",authrep.findAll());
        return "authors";

   }
}


