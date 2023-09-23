package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UpdateUser {
    private String firstName;
    private String lastName;
    private String phone;
}
