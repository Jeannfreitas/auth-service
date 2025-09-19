package security.auth.repository;


import org.springframework.data.repository.CrudRepository;
import security.auth.model.UserEntity;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
