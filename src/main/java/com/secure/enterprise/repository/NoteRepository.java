package com.secure.enterprise.repository;

import com.secure.enterprise.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface NoteRepository extends JpaRepository<Note, Long> {
        List<Note> findByOwnerUserName(String ownerUserName);
    }


