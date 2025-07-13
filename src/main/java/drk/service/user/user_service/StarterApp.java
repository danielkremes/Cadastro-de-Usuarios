package drk.service.user.user_service;

import drk.service.user.user_service.model.Users;
import drk.service.user.user_service.repository.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StarterApp implements CommandLineRunner {
    @Autowired
    private UserServiceRepository userServiceRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Users> users = List.of(new Users("Ana", "ana@email.com", "ana@email.com", "anaUser1", 24), new Users("Jose", "jose@email.com", "jose@email.com", "joseUser2", 25), new Users("Pedro", "pedro@email.com", "pedro@email.com", "pedroUser3", 26), new Users("Alex", "alex@email.com", "alex@email.com", "alexUser4", 27), new Users("Sergio", "sergio@email.com", "sergio@email.com", "sergioUser5", 28), new Users("Daniel", "daniel@email.com", "daniel@email.com", "danielUser6", 29), new Users("Mariana", "mariana@email.com", "mariana@email.com", "marianaUser7", 30), new Users("Carla", "carla@email.com", "carla@email.com", "carlaUser8", 31), new Users("Felipe", "felipe@email.com", "felipe@email.com", "felipeUser9", 22), new Users("Rafael", "rafael@email.com", "rafael@email.com", "rafaelUser10", 23), new Users("Julia", "julia@email.com", "julia@email.com", "juliaUser11", 24), new Users("Lucas", "lucas@email.com", "lucas@email.com", "lucasUser12", 25), new Users("Bruno", "bruno@email.com", "bruno@email.com", "brunoUser13", 26), new Users("Beatriz", "beatriz@email.com", "beatriz@email.com", "beatrizUser14", 27), new Users("Marcos", "marcos@email.com", "marcos@email.com", "marcosUser15", 28), new Users("Patricia", "patricia@email.com", "patricia@email.com", "patriciaUser16", 29), new Users("Thiago", "thiago@email.com", "thiago@email.com", "thiagoUser17", 30), new Users("Camila", "camila@email.com", "camila@email.com", "camilaUser18", 31), new Users("Ricardo", "ricardo@email.com", "ricardo@email.com", "ricardoUser19", 22), new Users("Fernanda", "fernanda@email.com", "fernanda@email.com", "fernandaUser20", 23), new Users("Gustavo", "gustavo@email.com", "gustavo@email.com", "gustavoUser21", 24), new Users("Adriana", "adriana@email.com", "adriana@email.com", "adrianaUser22", 25), new Users("André", "andre@email.com", "andre@email.com", "andreUser23", 26), new Users("Daniela", "daniela@email.com", "daniela@email.com", "danielaUser24", 27), new Users("Eduardo", "eduardo@email.com", "eduardo@email.com", "eduardoUser25", 28), new Users("Larissa", "larissa@email.com", "larissa@email.com", "larissaUser26", 29), new Users("Mateus", "mateus@email.com", "mateus@email.com", "mateusUser27", 30), new Users("Nathalia", "nathalia@email.com", "nathalia@email.com", "nathaliaUser28", 31), new Users("Paulo", "paulo@email.com", "paulo@email.com", "pauloUser29", 22), new Users("Roberta", "roberta@email.com", "roberta@email.com", "robertaUser30", 23), new Users("Sofia", "sofia@email.com", "sofia@email.com", "sofiaUser31", 24), new Users("Thiago", "thiago2@email.com", "thiago2@email.com", "thiagoUser32", 25), new Users("Vanessa", "vanessa@email.com", "vanessa@email.com", "vanessaUser33", 26), new Users("Willian", "willian@email.com", "willian@email.com", "willianUser34", 27), new Users("Yasmin", "yasmin@email.com", "yasmin@email.com", "yasminUser35", 28), new Users("Zeca", "zeca@email.com", "zeca@email.com", "zecaUser36", 29), new Users("Bianca", "bianca@email.com", "bianca@email.com", "biancaUser37", 30), new Users("Claudio", "claudio@email.com", "claudio@email.com", "claudioUser38", 31), new Users("Denise", "denise@email.com", "denise@email.com", "deniseUser39", 22), new Users("Erica", "erica@email.com", "erica@email.com", "ericaUser40", 23));
        userServiceRepository.saveAll(users);
    }
}

