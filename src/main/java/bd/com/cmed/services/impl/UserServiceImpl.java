package bd.com.cmed.services.impl;

import bd.com.cmed.domains.User;
import bd.com.cmed.repositories.UserRepository;
import bd.com.cmed.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sayemkcn on 5/22/17.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;

    @Override
    public User save(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User findOne(Long id) {
        return this.userRepo.findOne(id);
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepo.findByEmail(email);
    }

    @Override
    public User findByPhone(String phone) {
        return this.userRepo.findByPhone(phone);
    }
}
