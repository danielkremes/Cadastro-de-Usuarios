package drk.service.user.user_service.controller;

import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<Users> ListAllUser () {
        return userService.ListAllUser();
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
