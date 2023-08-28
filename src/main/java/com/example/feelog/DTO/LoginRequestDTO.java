package com.example.feelog.DTO;
import lombok.Data;
import com.example.feelog.Auth.Authority;

public class LoginRequestDTO {
    private String email;
    private String password;
    private String name;

    private Authority authority;
}
