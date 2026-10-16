package com.example.lac3;

/**
 * Lab 4: คลาส RegularUser สืบทอดจาก User (Inheritance)
 * - Polymorphism: กำหนดขีดจำกัดโน้ตสูงสุด 10 โน้ต
 */
public class RegularUser extends User {

    public RegularUser(String id, String username, String email) {
        super(id, username, email);
    }

    @Override
    public int getMaxNoteLimit() {
        return 10;
    }
}
