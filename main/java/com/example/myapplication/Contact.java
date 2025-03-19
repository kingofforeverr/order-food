package com.example.myapplication;

public class Contact {
    private String name;
    private String phone;
    private int imageResId;

    public Contact(String name, String phone, int imageResId) {
        this.name = name;
        this.phone = phone;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public int getImageResId() { return imageResId; }
}

