package cyberwaste.brightonbeach.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.repository.ApplyRepository;
import cyberwaste.brightonbeach.repository.UserRepository;
import cyberwaste.brightonbeach.specification.SerializableSpecification;
import cyberwaste.brightonbeach.web.model.AppliesLazyModel;
import cyberwaste.brightonbeach.web.service.ApplyService;

@Service("applyService")
public class ApplyServiceImpl implements ApplyService {
    
    @Autowired
    private ApplyRepository applyRepository;
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public AppliesLazyModel lazyModel(SerializableSpecification<Apply> specification) {
        return new AppliesLazyModel(specification);
    }
    
    @Override
    public void makeApplyForCard(String username, Card card, MessageContext messageContext) {
        User user = userRepository.findByName(username);
        
        Apply apply = new Apply();
        apply.setName(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        apply.setUser(user);
        apply.setCard(card);
        
        applyRepository.save(apply);
        
        messageContext.addMessage(
            new MessageBuilder().info().defaultText("Apply for card \"" + card.getName() + "\" was made").build()
        );
    }
}
