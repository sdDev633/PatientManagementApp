package com.patient_management.authservice.dto;

public class LoginResponseDTO {
    private final String token;

    public LoginResponseDTO(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
}
