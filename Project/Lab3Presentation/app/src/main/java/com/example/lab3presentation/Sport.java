package com.example.lab3presentation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sport {
    private final String fullName;
    private final Date dateOfBirth;
    private final int countryFlag;
    private final int imageResource;

    public Sport(String fullName, Date dateOfBirth, int countryFlag, int imageResource) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.countryFlag = countryFlag;
        this.imageResource = imageResource;
    }

    public String getFullName() {
        return fullName;
    }

    private int getAge() {
        return (int) ((new Date().getTime() - dateOfBirth.getTime()) / (1000 * 60 * 60 * 24 * 365.25));
    }

    public String getDateOfBirthString() {
        return new SimpleDateFormat("MMMM dd, yyyy").format(dateOfBirth) + " (age: " + getAge() + ")";
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public int getImageResource() {
        return imageResource;
    }
}
