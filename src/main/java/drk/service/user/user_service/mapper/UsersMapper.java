package drk.service.user.user_service.mapper;

import drk.service.user.user_service.dto.ListUsersDTO;
import drk.service.user.user_service.dto.UsersDTO;
import drk.service.user.user_service.model.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersMapper {

    public Users entityForDTO(UsersDTO usersDTO) {
        return Users.builder().name(usersDTO.getName()).email(usersDTO.getEmail()).username(usersDTO.getUsername()).password(usersDTO.getPassword()).age(usersDTO.getAge()).build();
    }

    public UsersDTO dtoForEntity(Users users) {
        return UsersDTO.builder().name(users.getName()).email(users.getEmail()).username(users.getUsername()).password(users.getPassword()).age(users.getAge()).build();
    }

    public List<UsersDTO> dtoListFromEntityList(List<Users> usersList) {
        return usersList.stream()
                .map(this::dtoForEntity)
                .toList();
    }

    public List<ListUsersDTO> listUsersFromEntityList(List<Users> usersList) {
        return usersList.stream()
                .map(user -> ListUsersDTO.builder()
                        .name(user.getName())
                        .email(user.getEmail())
                        .username(user.getUsername())
                        .age(user.getAge())
                        .build())
                .toList();
    }


}
