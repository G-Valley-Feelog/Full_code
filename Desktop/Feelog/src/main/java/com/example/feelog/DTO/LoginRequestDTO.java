package com.example.feelog.DTO;
import lombok.*;
import com.example.feelog.Auth.Authority;

@Data
public class LoginRequestDTO {
    private String email;
    private String password;
    private String name;

    private Authority authority;
}
