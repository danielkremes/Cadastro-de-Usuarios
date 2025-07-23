package drk.service.user.user_service.repository;

import drk.service.user.user_service.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserServiceRepository extends JpaRepository<Users, Long> {
}
