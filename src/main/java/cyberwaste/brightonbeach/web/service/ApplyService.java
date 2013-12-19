package cyberwaste.brightonbeach.web.service;

import org.springframework.binding.message.MessageContext;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.specification.SerializableSpecification;
import cyberwaste.brightonbeach.web.model.AppliesLazyModel;

public interface ApplyService {
    
    AppliesLazyModel lazyModel(SerializableSpecification<Apply> specification);
    void makeApplyForCard(Card card, MessageContext messageContext);
}
