package kg.finalproject.natvkg.models.DTO;

import lombok.Data;

@Data
public class UsersDTO {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private int phoneNumber;
}
