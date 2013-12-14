package cyberwaste.brightonbeach.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
