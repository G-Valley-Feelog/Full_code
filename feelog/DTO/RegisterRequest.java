package com.example.feelog.DTO;

import lombok.*;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterRequest {
    private String email;
    private String password;
    private String name;
    private String introduce;
}