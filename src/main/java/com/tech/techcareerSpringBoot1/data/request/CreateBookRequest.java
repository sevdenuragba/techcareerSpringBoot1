package com.tech.techcareerSpringBoot1.data.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookRequest {

    private String name;
    private String releaseYear;
}