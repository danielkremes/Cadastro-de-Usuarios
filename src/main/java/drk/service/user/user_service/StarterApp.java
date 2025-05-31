package drk.service.user.user_service;

import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.repository.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StarterApp implements CommandLineRunner {
    @Autowired
    private UserServiceRepository userServiceRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Users> users = Arrays.asList(
                new Users("Jose", 28, "jose06@gmail.com", "Admin", "1234"),
                new Users("Ana", 24, "ana@email.com", "anaUser", "senha123"),
                new Users("Carlos", 35, "carlos@email.com", "carlosdev", "pass123"),
                new Users("Mariana", 30, "mariana@email.com", "mariAdmin", "adminpass"),
                new Users("Pedro", 22, "pedro@email.com", "pedroUser", "p@ss22"),
                new Users("Lucia", 27, "lucia@email.com", "lucia123", "luciaPass"),
                new Users("Roberto", 40, "roberto@email.com", "rob_admin", "123456"),
                new Users("Fernanda", 33, "fernanda@email.com", "fernanda", "senhaF33"),
                new Users("Tiago", 29, "tiago@email.com", "tiagoUser", "tiago2024"),
                new Users("Juliana", 26, "juliana@email.com", "julie", "juliePwd")
        );

        userServiceRepository.saveAll(users);
    }
}

