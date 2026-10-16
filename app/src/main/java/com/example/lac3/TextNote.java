package com.example.lac3;

/**
 * Lab 4: คลาส TextNote สืบทอดจาก Note (Inheritance)
 * - Polymorphism: Override เมธอด getSummary() สำหรับจัดการโน้ตข้อความ
 */
public class TextNote extends Note {
    private String content;

    public TextNote(String id, String title, String content) {
        super(id, title);
        this.content = content;
    }

    // Encapsulation
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getSummary() {
        if (content.length() <= 50) {
            return content;
        } else {
            return content.substring(0, 50) + "...";
        }
    }
}
