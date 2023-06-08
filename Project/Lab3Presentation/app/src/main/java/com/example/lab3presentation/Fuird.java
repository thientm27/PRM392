package com.example.lab3presentation;

public class Fuird {
    private final String fullName;
    private final String Description;
    private final int imageResource;

    public Fuird(String fullName, String Description, int imageResource) {
        this.fullName = fullName;
        this.Description = Description;
        this.imageResource = imageResource;
    }

    public String getFullName() {
        return fullName;
    }


    public String getDescriptionString() {
        return Description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
