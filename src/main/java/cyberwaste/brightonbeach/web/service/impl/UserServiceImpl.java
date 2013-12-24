package cyberwaste.brightonbeach.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.repository.UserRepository;
import cyberwaste.brightonbeach.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User getUser(String username) {
        return userRepository.findByName(username);
    }
}
