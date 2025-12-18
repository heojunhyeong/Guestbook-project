package org.example.project.repository;

import org.example.project.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {

    List<Guestbook> findAllByOrderByCreatedAtDesc();
}
