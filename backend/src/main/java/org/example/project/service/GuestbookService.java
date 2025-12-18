package org.example.project.service;

import lombok.RequiredArgsConstructor;
import org.example.project.dto.GuestbookDTO;
import org.example.project.dto.GuestbookRequestDTO;
import org.example.project.dto.GuestbookResponseDTO;
import org.example.project.entity.Guestbook;
import org.example.project.repository.GuestbookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class GuestbookService {

    private GuestbookRepository guestBookRepository;

    public void create(GuestbookDTO request) {
        Guestbook guestbook = new Guestbook(request.getNickname(), request.getContent());
        guestBookRepository.save(guestbook);
    }

    public List<GuestbookResponseDTO> findAll() {
        return guestBookRepository.findAllByOrderByCreatedAtDesc()
                .stream()
                .map(GuestbookResponseDTO::new)
                .toList();
    }

    @Transactional
    public GuestbookResponseDTO create(GuestbookRequestDTO request) {
        Guestbook guestbook =
                new Guestbook(request.getWriter(), request.getMessage());

        Guestbook saved = guestBookRepository.save(guestbook);
        return new GuestbookResponseDTO(saved);
    }

}
