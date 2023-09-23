package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Login {

    private String username;
    private String password;
}
