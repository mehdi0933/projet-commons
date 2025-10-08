package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDataAccessDto {

    private Long id;
    private String mail;
    private String password;
    private LocalDateTime searchDateTime;


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostInput {
        private Long id;
        private String mail;
        private String password;
        private LocalDateTime searchDateTime;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostOutput {
        private Long id;
        private String mail;
        private String password;
        private LocalDateTime searchDateTime;

    }
}