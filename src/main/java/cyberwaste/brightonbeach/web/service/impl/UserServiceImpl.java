package cyberwaste.brightonbeach.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.repository.UserRepository;
import cyberwaste.brightonbeach.web.service.I18nService;
import cyberwaste.brightonbeach.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private I18nService i18nService;
    
    @Override
    public User getUser(String username) {
        return userRepository.findByName(username);
    }
    
    @Override
    public List<User> findSpecified(Specification<User> specification) {
        return userRepository.findAll(specification);
    }
    
    @Override
    public User create() {
        return new User();
    }
    
    @Override
    public List<SelectItem> allRoles() {
        List<SelectItem> allRoles = new ArrayList<>();
        allRoles.add(new SelectItem("ROLE_ADMIN", i18nService.userRole("ROLE_ADMIN")));
        allRoles.add(new SelectItem("ROLE_USER", i18nService.userRole("ROLE_USER")));
        
        return allRoles;
    }
    
    @Override
    public boolean save(User userToSave, MessageContext messageContext) {
        userRepository.save(userToSave);
        
        messageContext.addMessage(
            new MessageBuilder().info().defaultText(i18nService.userWasSaved(userToSave)).build()
        );
        return true;
    }
    
    @Override
    public boolean delete(String currentUser, User userToDelete, MessageContext messageContext) {
        if (userToDelete.equals(getUser(currentUser))) {
            messageContext.addMessage(
                new MessageBuilder().error().defaultText(i18nService.userCantDeleteItself()).build()
            );
            
            return false;
        }
        userRepository.delete(userToDelete);
        
        messageContext.addMessage(
            new MessageBuilder().info().defaultText(i18nService.userWasDeleted(userToDelete)).build()
        );
        return true;
    }
}
