package cyberwaste.brightonbeach.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.repository.CardRepository;
import cyberwaste.brightonbeach.web.service.CardService;

@Service("cardService")
public class CardServiceImpl implements CardService {
    
    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> findSpecified(Specification<Card> specification) {
        return cardRepository.findAll(specification);
    }
    
    @Override
    public Card create() {
        return new Card();
    }
    
    @Override
    public boolean save(Card cardToSave, MessageContext messageContext) {
        cardRepository.save(cardToSave);
        messageContext.addMessage(
            new MessageBuilder().info().defaultText("Card with name \"" + cardToSave.getName() + "\" was saved").build()
        );
        return true;
    }
    
    @Override
    public void delete(Card cardToDelete, MessageContext messageContext) {
        cardRepository.delete(cardToDelete);
        
        messageContext.addMessage(
            new MessageBuilder().info().defaultText("Card \"" + cardToDelete.getName() + "\" was deleted").build()
        );
    }
}
