package com.example.lac3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class NoteUserLab4Test {

    @Test
    public void testPolymorphicNotes() {
        Note textNote = new TextNote("1", "Lab 4 Assignment", "OOP principles implementation in Java.");
        assertEquals("OOP principles implementation in Java.", textNote.getSummary());

        CheckListItem item1 = new CheckListItem("Design classes", true);
        CheckListItem item2 = new CheckListItem("Write Java code", true);
        Note checkListNote = new CheckListNote("2", "Tasks", Arrays.asList(item1, item2));
        assertEquals("Checklist: 2/2 completed", checkListNote.getSummary());
    }

    @Test
    public void testUserInheritanceAndLimits() {
        User regularUser = new RegularUser("u1", "student1", "student@example.com");
        assertEquals(10, regularUser.getMaxNoteLimit());

        User premiumUser = new PremiumUser("u2", "admin", "admin@example.com");
        assertEquals(Integer.MAX_VALUE, premiumUser.getMaxNoteLimit());

        regularUser.addNote(new TextNote("n1", "OOP", "Encapsulation, Inheritance, Polymorphism, Abstraction"));
        assertEquals(1, regularUser.getTotalNotesCount());
    }
}
