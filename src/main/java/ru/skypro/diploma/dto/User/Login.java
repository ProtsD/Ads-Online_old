package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

@Component
@Data
public class Login {
    @Size(min = 8, max = 16)
    private String username;
    @Size(min = 4, max = 32)
    private String password;
}
