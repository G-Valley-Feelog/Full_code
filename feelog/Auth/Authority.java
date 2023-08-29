package com.example.feelog.Auth;


import lombok.Getter;
import lombok.RequiredArgsConstructor;




@Getter
@RequiredArgsConstructor
public enum Authority {
    USER("ROLE_USER", "일반사용자"),
    ADMIN("ROLE_ADMIN", "일반관리자");

    private final String key;
    private final String title;
}
