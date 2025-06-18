package br.com.gyselle.arcanequotes.controller;

import br.com.gyselle.arcanequotes.dto.QuoteDTO;
import br.com.gyselle.arcanequotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService service;

    @GetMapping("/series/quotes")
    public QuoteDTO getRandomQuote() {
        return service.getRandomQuote();
    }
}
