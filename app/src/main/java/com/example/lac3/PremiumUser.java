package com.example.lac3;

/**
 * Lab 4: คลาส PremiumUser สืบทอดจาก User (Inheritance)
 * - Polymorphism: กำหนดขีดจำกัดโน้ตไม่จำกัด (Integer.MAX_VALUE)
 */
public class PremiumUser extends User {

    public PremiumUser(String id, String username, String email) {
        super(id, username, email);
    }

    @Override
    public int getMaxNoteLimit() {
        return Integer.MAX_VALUE;
    }
}
