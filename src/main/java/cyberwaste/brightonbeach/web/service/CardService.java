package cyberwaste.brightonbeach.web.service;

import java.util.List;

import org.springframework.binding.message.MessageContext;
import org.springframework.data.jpa.domain.Specification;

import cyberwaste.brightonbeach.domain.Card;

public interface CardService {
    
    List<Card> findSpecified(Specification<Card> specification);
    
    Card create();
    boolean save(Card cardToSave, MessageContext messageContext);
    void delete(Card cardToDelete, MessageContext messageContext);
}
