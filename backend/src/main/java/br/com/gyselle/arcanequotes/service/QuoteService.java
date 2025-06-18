package br.com.gyselle.arcanequotes.service;

import br.com.gyselle.arcanequotes.dto.QuoteDTO;
import br.com.gyselle.arcanequotes.model.Quote;
import br.com.gyselle.arcanequotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository repository;

    public QuoteDTO getRandomQuote() {
        Quote quote = repository.findRandomQuote();
        return new QuoteDTO(quote.getTitle(),
                            quote.getQuote(),
                            quote.getCharacter(),
                            quote.getPoster());
    }
}
