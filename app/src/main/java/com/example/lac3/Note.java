package com.example.lac3;

import java.util.Date;

/**
 * Lab 4: คลาส Note (Abstract Superclass)
 * - Abstraction: กำหนดโครงสร้างกลางและ abstract method getSummary()
 * - Encapsulation: ซ่อนข้อมูลภายใน (private fields) ผ่าน getter/setter
 */
public abstract class Note {
    private String id;
    private String title;
    private Date createdDate;

    public Note(String id, String title) {
        this.id = id;
        this.title = title;
        this.createdDate = new Date();
    }

    // Encapsulation: Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // Abstraction & Polymorphism: เมธอดนามธรรมที่ Subclass ต้องนำไป implement เอง
    public abstract String getSummary();
}
