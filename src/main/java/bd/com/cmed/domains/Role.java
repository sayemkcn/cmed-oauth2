package bd.com.cmed.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * Created by sayemkcn on 5/22/17.
 */
@Entity
public class Role extends BaseEntity {
    private String name;
    @JsonBackReference
    @ManyToMany
    private Collection<User> users;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
