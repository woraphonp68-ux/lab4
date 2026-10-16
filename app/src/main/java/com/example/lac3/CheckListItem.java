package com.example.lac3;

/**
 * Lab 4: คลาสสำหรับรายการย่อยใน CheckListNote (Encapsulation)
 */
public class CheckListItem {
    private String text;
    private boolean isCompleted;

    public CheckListItem(String text, boolean isCompleted) {
        this.text = text;
        this.isCompleted = isCompleted;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
