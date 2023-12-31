package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @NotBlank(message = "Title is required")
    @Size(min =  3, max =  200, message = "Title must be between 2 and 200 characters")
    private  String name;


    @Min(value = 0, message = "Price must be greater than or equals to 0")
    @Max(value = 10000000, message = "Price must be less than or equals to 10,000,000")

    private  Float price;
    private  String thumnail;
    private  String description;
    @JsonProperty("category_id")
    private  String categoryId;

}
