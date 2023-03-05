package com.erbol.notes;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int dayOfWeeks;
    private int priority;

    public Note(int id, String title, String description, int dayOfWeeks, int priority) {
        this.id=id;
        this.title = title;
        this.description = description;
        this.dayOfWeeks = dayOfWeeks;
        this.priority = priority;

    }
    @Ignore
    public Note(String title, String description, int dayOfWeeks, int priority) {
        this.title = title;
        this.description = description;
        this.dayOfWeeks = dayOfWeeks;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDayOfWeeks() {
        return dayOfWeeks;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDayOfWeeks(int dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static String getDayAsString(int position) {
        switch (position) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятинца";
            case 6:
                return "Суббота";
            default:
                return "Воскресенье";
        }
    }
}
