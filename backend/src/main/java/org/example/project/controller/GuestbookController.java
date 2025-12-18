package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.dto.GuestbookDTO;
import org.example.project.dto.GuestbookRequestDTO;
import org.example.project.dto.GuestbookResponseDTO;
import org.example.project.service.GuestbookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/guestbook")
@RequiredArgsConstructor
public class GuestbookController {

    private final GuestbookService guestbookService;

    @PostMapping
    public GuestbookResponseDTO create(
            @RequestBody GuestbookRequestDTO request
    ) {
        return guestbookService.create(request);
    }

    @GetMapping
    public List<GuestbookResponseDTO> findAll() {
        return guestbookService.findAll();
    }
}
