package org.example.project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GuestbookRequestDTO {
    private String nickname;
    private String content;
}