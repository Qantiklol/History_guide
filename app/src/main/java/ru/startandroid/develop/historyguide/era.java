package ru.startandroid.develop.historyguide;

public class era {

    int id;
    String img, title, era_start, era_end, color, text;


    public era(int id, String img, String title, String era_start, String era_end, String color, String text) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.era_start = era_start;
        this.era_end = era_end;
        this.color = color;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEra_start() {
        return era_start;
    }

    public void setEra_start(String era_start) {
        this.era_start = era_start;
    }

    public String getEra_end() {
        return era_end;
    }

    public void setEra_end(String era_end) {
        this.era_end = era_end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
