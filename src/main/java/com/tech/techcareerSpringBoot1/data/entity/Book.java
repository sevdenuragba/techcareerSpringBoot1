package com.tech.techcareerSpringBoot1.data.entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document("books")
public class Book extends BaseEntity{
    private String name;
    private String releaseYear;
    private String authorID;
}
