package edu.psu.sweng888.practiceiiapplication;

import java.io.Serializable;

public class Item implements Serializable {
    private int id;
    private String title;
    private String subtitle;

    public Item(int id, String title, String subtitle) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
    }

    // Getter and Setter methods for the class attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}