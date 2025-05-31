package drk.service.user.user_service.repository;

import drk.service.user.user_service.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepository extends JpaRepository<Users, Long> {
}
