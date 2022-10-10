package trey.loginandreg.repositories;

import org.springframework.data.repository.CrudRepository;
import trey.loginandreg.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User,Long> {
    Optional<User> findByEmail(String email);
}
