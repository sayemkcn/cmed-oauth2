package bd.com.cmed.services;

import bd.com.cmed.domains.User;
import org.springframework.stereotype.Service;

/**
 * Created by sayemkcn on 5/22/17.
 */
public interface UserService {
    User save(User user);
    User findOne(Long id);
    User findByEmail(String email);
    User findByPhone(String phone);
}
