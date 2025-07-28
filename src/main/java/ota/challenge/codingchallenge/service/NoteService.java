package ota.challenge.codingchallenge.service;

import ota.challenge.codingchallenge.exception.NoteNotFoundException;
import ota.challenge.codingchallenge.model.Note;
import ota.challenge.codingchallenge.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository repository;

    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public Note createNote(Note note) {
        return repository.save(note);
    }

    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    public Note getNoteById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException(id));
    }

    public Note updateNote(Long id, Note updatedNote) {
        Note existing = getNoteById(id);
        existing.setTitle(updatedNote.getTitle());
        existing.setBody(updatedNote.getBody());
        return repository.save(existing);
    }

    public void deleteNote(Long id) {
        if (!repository.existsById(id)) {
            throw new NoteNotFoundException(id);
        }
        repository.deleteById(id);
    }
}
