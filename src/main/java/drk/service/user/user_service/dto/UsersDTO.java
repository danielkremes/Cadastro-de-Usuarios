package drk.service.user.user_service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDTO {

    private String name;
    private String email;
    private String username;
    private String password;
    private int age;
}
