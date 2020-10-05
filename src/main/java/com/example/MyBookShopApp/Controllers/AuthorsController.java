package com.example.MyBookShopApp.Controllers;

import com.example.MyBookShopApp.services.AuthorService;
import com.example.MyBookShopApp.services.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class AuthorsController {

    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("authorList", authorService.getAuthors());
        model.addAttribute("alphabetList", Utils.getListEngAlphabet());
        return "authors/index";
    }
}
