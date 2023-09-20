package ru.skypro.diploma.service;

import ru.skypro.diploma.dto.Register;

public interface AuthService {
    boolean login(String userName, String password);

    boolean register(Register register);
}
