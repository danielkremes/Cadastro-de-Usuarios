package drk.service.user.user_service.controller;

import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<Users> ListAllUser () {
        return userService.ListAllUser();
    }

    @GetMapping("/{id}")
    public Optional<Users> listById (@PathVariable Long id) {
        return userService.listById(id);
    }

    @PostMapping
    public Users saveUser(@RequestBody Users users) {
        return userService.saveUser(users);
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users users) {
        return userService.updateUser(id,users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
