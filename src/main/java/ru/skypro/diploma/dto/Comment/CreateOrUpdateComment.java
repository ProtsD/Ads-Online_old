package ru.skypro.diploma.dto.Comment;

import lombok.Data;

@Data
public class CreateOrUpdateComment {
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
