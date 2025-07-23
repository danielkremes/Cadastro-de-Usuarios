package drk.service.user.user_service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListUsersDTO {
    private String name;
    private int age;
    private String username;
    private String email;
}
