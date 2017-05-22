package bd.com.cmed.repositories;

import bd.com.cmed.domains.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sayemkcn on 5/22/17.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
