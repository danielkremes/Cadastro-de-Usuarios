package drk.service.user.user_service.service;

import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.repository.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserServiceRepository userServiceRepository;

    public List<Users> ListAllUser() {
        return userServiceRepository.findAll();
    }

    public Optional<Users> listById(Long id) {
        return userServiceRepository.findById(id);
    }

    public Users saveUser(Users users) {
        return userServiceRepository.save(users);
    }

    public Users updateUser(Long id, Users newUser) {
        Optional<Users> userExisting = userServiceRepository.findById(id);

        if (userExisting.isPresent()) {
            Users users = userExisting.get();

            users.setName(newUser.getName());
            users.setAge(newUser.getAge());
            users.setEmail(newUser.getEmail());
            users.setUsername(newUser.getUsername());
            users.setPassword(newUser.getPassword());
           return userServiceRepository.save(users);
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }

    public void deleteUser(Long id) {
        userServiceRepository.deleteById(id);
    }

}
