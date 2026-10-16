package com.example.lac3;

import java.util.List;
import java.util.ArrayList;

/**
 * Lab 4: คลาส User (Abstract Superclass) ออกแบบตามหลัก OOP
 * - Abstraction: กำหนดโครงสร้างการจัดการผู้ใช้และ abstract method getMaxNoteLimit()
 * - Encapsulation: ซ่อนข้อมูลภายใน (private fields) ผ่าน getter/setter
 */
public abstract class User {
    private String id;
    private String username;
    private String email;
    private List<Note> notes;

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.notes = new ArrayList<>();
    }

    // Encapsulation: Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes != null ? new ArrayList<>(notes) : new ArrayList<>();
    }

    public void addNote(Note note) {
        if (notes.size() < getMaxNoteLimit()) {
            notes.add(note);
        } else {
            throw new IllegalStateException("Note limit reached for this user type.");
        }
    }

    public boolean removeNote(String noteId) {
        return notes.removeIf(note -> note.getId().equals(noteId));
    }

    public int getTotalNotesCount() {
        return notes.size();
    }

    public List<Note> searchNotes(String keyword) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(note);
            }
        }
        return result;
    }

    // Abstraction & Polymorphism: Subclass กำหนดนโยบายขีดจำกัดโน้ตของตนเอง
    public abstract int getMaxNoteLimit();
}
