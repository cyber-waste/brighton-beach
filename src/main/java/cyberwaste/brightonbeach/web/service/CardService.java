package cyberwaste.brightonbeach.web.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import cyberwaste.brightonbeach.domain.Card;

public interface CardService {
    
    List<Card> findSpecified(Specification<Card> specification);
}
