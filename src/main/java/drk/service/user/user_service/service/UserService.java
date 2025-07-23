package drk.service.user.user_service.service;

import drk.service.user.user_service.dto.ListUsersDTO;
import drk.service.user.user_service.dto.UsersDTO;
import drk.service.user.user_service.mapper.UsersMapper;
import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.repository.UserServiceRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserServiceRepository userServiceRepository;
    private final UsersMapper usersMapper;

    public List<ListUsersDTO> listUsers() {
        List<Users> users = userServiceRepository.findAll();
        return usersMapper.listUsersFromEntityList(users);
    }

    public Optional<Users> listById(Long id) {
        return userServiceRepository.findById(id);
    }

    public UsersDTO saveUser(UsersDTO usersDTO) {
        Users users = usersMapper.entityForDTO(usersDTO);
        userServiceRepository.save(users);
        return usersMapper.dtoForEntity(users);
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
