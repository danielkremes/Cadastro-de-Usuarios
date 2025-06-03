package drk.service.user.user_service.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 150, nullable = true)
    private String email;
    @Column(length = 100, nullable = false)
    private String username;
    @Column(length = 15, nullable = false)
    private String password;
    @Column(length = 3,nullable = false)
    private int age;

    public Users(String name, int age, String email, String username, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
