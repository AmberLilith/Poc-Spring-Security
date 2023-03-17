package poc.spring.secutiy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import poc.spring.secutiy.models.UserModel;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
    UserDetails findByName(String name);
}
