package org.example.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Guestbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nickname;

    @Column(nullable = false, length = 500)
    private String content;

    private LocalDateTime createdAt;

    public Guestbook(String nickname, String content) {
        this.nickname = nickname;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
}
