package com.example.lac3;

import java.util.List;
import java.util.ArrayList;

/**
 * Lab 4: คลาส CheckListNote สืบทอดจาก Note (Inheritance)
 * - Polymorphism: Override เมธอด getSummary() สำหรับสรุปรายการ Checklist
 */
public class CheckListNote extends Note {
    private List<CheckListItem> items;

    public CheckListNote(String id, String title, List<CheckListItem> items) {
        super(id, title);
        this.items = items != null ? new ArrayList<>(items) : new ArrayList<>();
    }

    public List<CheckListItem> getItems() {
        return items;
    }

    public void setItems(List<CheckListItem> items) {
        this.items = items != null ? new ArrayList<>(items) : new ArrayList<>();
    }

    public void addItem(CheckListItem item) {
        this.items.add(item);
    }

    @Override
    public String getSummary() {
        long completedCount = items.stream().filter(CheckListItem::isCompleted).count();
        return "Checklist: " + completedCount + "/" + items.size() + " completed";
    }
}
