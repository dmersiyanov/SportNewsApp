package com.example.dmitrymersiyanov.mobidoo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsItem {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("short_text")
    @Expose
    private String shortText;
    @SerializedName("full_text")
    @Expose
    private String fullText;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("coefficient")
    @Expose
    private String coefficient;
    @SerializedName("schedule")
    @Expose
    private String schedule;
    @SerializedName("publicated_at")
    @Expose
    private String publicatedAt;
    @SerializedName("type")
    @Expose
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPublicatedAt() {
        return publicatedAt;
    }

    public void setPublicatedAt(String publicatedAt) {
        this.publicatedAt = publicatedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}