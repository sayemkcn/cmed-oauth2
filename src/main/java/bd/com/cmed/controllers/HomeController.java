package bd.com.cmed.controllers;

import bd.com.cmed.domains.Role;
import bd.com.cmed.domains.User;
import bd.com.cmed.repositories.RoleRepository;
import bd.com.cmed.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sayemkcn on 5/22/17.
 */
@RestController
public class HomeController {


    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {

        Role role = new Role("ROLE_ADMIN");
        role = roleRepo.save(role);
        Collection<Role> roles = new ArrayList<>();
        roles.add(role);
        User user = new User("Sayem Hossain", "sayemkcn@gmail.com","01710226163","test", roles);
        if (userRepo.findOne(1l) == null)
            userRepo.save(user);
        return "Hello World!";
    }
}
