package com.example.lbw.guaniu.Song;

/**
 * Created by lbw on 2017/8/4.
 */

public class Song {
    private String title;
    private String text;
    private int imageId;

    public Song(String title, String text, int imageId) {
        this.title = title;
        this.text = text;
        this.imageId = imageId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
