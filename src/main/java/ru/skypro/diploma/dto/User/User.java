package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
    private String image;
}
