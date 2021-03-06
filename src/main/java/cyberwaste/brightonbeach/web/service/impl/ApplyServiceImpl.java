package cyberwaste.brightonbeach.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.ApplyState;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.repository.ApplyRepository;
import cyberwaste.brightonbeach.repository.UserRepository;
import cyberwaste.brightonbeach.specification.SerializableSpecification;
import cyberwaste.brightonbeach.web.model.AppliesLazyModel;
import cyberwaste.brightonbeach.web.service.ApplyService;
import cyberwaste.brightonbeach.web.service.I18nService;

@Service("applyService")
public class ApplyServiceImpl implements ApplyService {
    
    @Autowired
    private ApplyRepository applyRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private I18nService i18nService;

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
        apply.applyState(ApplyState.OPEN);
        
        applyRepository.save(apply);
        
        messageContext.addMessage(
            new MessageBuilder().info().defaultText(i18nService.applyWasMadeFor(apply)).build()
        );
    }
    
    @Override
    public void acceptApply(Apply apply, MessageContext messageContext) {
        if (apply.getState().equals(ApplyState.OPEN.name())) {
            apply.applyState(ApplyState.ACCEPTED);
            
            applyRepository.save(apply);
            
            messageContext.addMessage(
                new MessageBuilder().info().defaultText(i18nService.applyWasAccepted(apply)).build()
            );
        } else {
            messageContext.addMessage(
                new MessageBuilder().error().defaultText(i18nService.applyWasAlreadyResolved(apply)).build()
            );
        }
    }
    
    @Override
    public void rejectApply(Apply apply, MessageContext messageContext) {
        if (apply.getState().equals(ApplyState.OPEN.name())) {
            apply.applyState(ApplyState.REJECTED);
            
            applyRepository.save(apply);
            
            messageContext.addMessage(
                new MessageBuilder().info().defaultText(i18nService.applyWasRejected(apply)).build()
            );
        } else {
            messageContext.addMessage(
                new MessageBuilder().error().defaultText(i18nService.applyWasAlreadyResolved(apply)).build()
            );
        }
    }
}
