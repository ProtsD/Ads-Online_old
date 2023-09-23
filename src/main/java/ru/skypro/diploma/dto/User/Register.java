package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Register {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
}
