package org.example.dto;

import org.example.emu.ResponseType;
import org.example.emu.SupportedAi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class AiDto {
    @Data
    @Builder(toBuilder = true)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostInput {
        private String promptMsg;
        private String apiKey;
        private String url;
        private SupportedAi model;
        private ResponseType responseType;
        private long durationMs;
        private LocalDateTime searchDateTime;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostOutput {
        private String promptMsg;
        private String apiKey;
        private String url;
        private SupportedAi model;
        private ResponseType responseType;
        private long durationMs;
        private LocalDateTime searchDateTime;

    }
}
