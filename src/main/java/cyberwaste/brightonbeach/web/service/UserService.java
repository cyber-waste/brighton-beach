package cyberwaste.brightonbeach.web.service;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.binding.message.MessageContext;
import org.springframework.data.jpa.domain.Specification;

import cyberwaste.brightonbeach.domain.User;

public interface UserService {
    
    List<SelectItem> allRoles();
    
    User getUser(String username);
    List<User> findSpecified(Specification<User> specification);
    
    User create();
    boolean save(User userToSave, MessageContext messageContext);
    boolean delete(String currentUser, User userToDelete, MessageContext messageContext);
}
