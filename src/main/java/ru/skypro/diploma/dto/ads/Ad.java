package ru.skypro.diploma.dto.ads;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
public class Ad {
    private int author;
    private String image;
    private int pk;
    @Min(0)
    @Max(10000000)
    private int price;
    @Size(min = 4, max = 32)
    private String title;
}
