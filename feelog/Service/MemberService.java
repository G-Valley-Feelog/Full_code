package com.example.feelog.Service;

import com.example.feelog.Auth.CustomUserDetail;
import com.example.feelog.Entity.Member;
import com.example.feelog.Repository.MemberRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.example.feelog.DTO.LoginRequestDTO;

import java.util.*;
import java.lang.*;

@Service
public class MemberService  {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;

    }


    public Optional<Member> getUserByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

   /* @Autowired
    public UserDetails loadUserbyUsername(String email) throws UsernameNotFoundException{
        Member member = memberRepository.findByEmail(email).orElse(null);
        System.out.println(member.getEmail());
        if(member == null){
            throw new UsernameNotFoundException("사용자 정보가 없습니다. ");

        }
        return new CustomUserDetail(member);
    }

    */
}
