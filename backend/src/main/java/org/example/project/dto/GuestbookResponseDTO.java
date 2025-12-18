package org.example.project.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.project.entity.Guestbook;

import java.time.LocalDateTime;

@Getter
@Setter
public class GuestbookResponseDTO {
    private Long id;
    private String nickname;
    private String content;
    private LocalDateTime createdAt;

    public GuestbookResponseDTO(Guestbook guestbook) {
        this.id = guestbook.getId();
        this.nickname = guestbook.getNickname();
        this.content = guestbook.getContent();
        this.createdAt = guestbook.getCreatedAt();
    }
}
