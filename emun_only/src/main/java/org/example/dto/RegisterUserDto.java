package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

public class RegisterUserDto {

    @Getter
    @Setter
    public static class PostInput {
        private String mail;
        private String password;
        private Set<String> roles;
    }

    @Getter
    @Setter
    @Builder
    public static class PostOutput {
        private Long id;
        private String mail;
        private Set<String> roles;
        private LocalDateTime searchDateTime;
    }
}
