package com.example.navbar;

import java.io.Serializable;

/**
 * This class represent a menu item inside a menu on the navigation bar.
 * 
 * @author M. Irribarra
 * @since Oct. 18, 2024
 * @version 1.0
 */
public class MenuItem implements Serializable {
    private String text = "";
    private String url = null;

    public MenuItem(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
