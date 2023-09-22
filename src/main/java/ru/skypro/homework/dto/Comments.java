package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class Comments {
    int countComments;
    Comment[] results;

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public Comment[] getResults() {
        return results;
    }

    public void setResults(Comment[] results) {
        this.results = results;
    }
}
