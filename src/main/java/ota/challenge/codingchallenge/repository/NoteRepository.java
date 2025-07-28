package ota.challenge.codingchallenge.repository;

import ota.challenge.codingchallenge.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {}
