package ru.skypro.diploma.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.diploma.dto.User.NewPassword;
import ru.skypro.diploma.dto.User.UpdateUser;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    @PostMapping("/set_password")
    public ResponseEntity<?> setPassword(@RequestBody NewPassword newPassword) {
        return null;
    }

    @GetMapping("/me")
    public ResponseEntity<?> getData() {
        return null;
    }

    @PatchMapping("/me")
    public ResponseEntity<?> updateData(@RequestBody UpdateUser updateUser) {
        return null;
    }

    @PatchMapping("me/image")
    public ResponseEntity<?> updateImage(@RequestParam MultipartFile image) {
        return null;
    }
}
