package com.example.topquiz.model;

public class User {
    private String mFirstName;
    private int mScore;

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public User() {
        this.mFirstName = "";
    }
}