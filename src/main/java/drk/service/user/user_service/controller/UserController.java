package drk.service.user.user_service.controller;

import drk.service.user.user_service.dto.ListUsersDTO;
import drk.service.user.user_service.dto.UsersDTO;
import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<ListUsersDTO>> getUsers() {
        return ResponseEntity.ok(userService.listUsers());
    }

    @GetMapping("/{id}")
    public Optional<Users> listById(@PathVariable Long id) {
        return userService.listById(id);
    }

    @PostMapping
    public UsersDTO saveUser(@RequestBody UsersDTO users) {
        return userService.saveUser(users);
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users users) {
        return userService.updateUser(id, users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
