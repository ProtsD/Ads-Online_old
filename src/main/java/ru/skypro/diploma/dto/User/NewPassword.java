package ru.skypro.diploma.dto.User;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NewPassword {
    private String currentPassword;
    private String newPassword;
}
