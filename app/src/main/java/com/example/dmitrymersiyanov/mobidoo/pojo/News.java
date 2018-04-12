package com.example.dmitrymersiyanov.mobidoo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("data")
    @Expose
    private List<NewsItem> newsItemList = null;

    public List<NewsItem> getData() {
        return newsItemList;
    }

    public void setData(List<NewsItem> data) {
        newsItemList = data;
    }

}