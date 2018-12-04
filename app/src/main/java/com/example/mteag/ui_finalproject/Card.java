package com.example.mteag.ui_finalproject;

public class Card {
    private int image;
    private int value;

    protected Card(int setImage, int setValue) {
        image = setImage;
        value = setValue;
    }

    public int getValue() {
        return value;
    }

    public int getImage() {
        return image;
    }
}
