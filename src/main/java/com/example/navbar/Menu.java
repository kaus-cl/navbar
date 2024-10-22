package com.example.navbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represent a Menu on the navigation bar.
 * 
 * @author M. Irribarra
 * @since Oct. 18, 2024
 * @version 1.0
 */
public class Menu implements Serializable {
    private String text = "";
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getText() {
        return text;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setText(String text) {
        this.text = text;
    }
}
