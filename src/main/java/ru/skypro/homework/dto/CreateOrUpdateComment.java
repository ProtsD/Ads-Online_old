package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CreateOrUpdateComment {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
