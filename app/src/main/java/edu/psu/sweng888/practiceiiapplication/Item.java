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

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

}