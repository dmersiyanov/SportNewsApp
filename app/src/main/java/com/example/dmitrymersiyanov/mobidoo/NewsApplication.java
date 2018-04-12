package com.example.dmitrymersiyanov.mobidoo;

import android.app.Application;

import com.example.dmitrymersiyanov.mobidoo.pojo.News;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class NewsApplication extends Application{


    private static final String API_URL = "http://tech-encoder.info";

    public interface NewsApiService {
        @GET("/api/news")
        Observable<News> getNews();

    }

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static NewsApiService newsApiService = retrofit.create(NewsApiService.class);


    public static NewsApiService getNewsApiService() {
        return newsApiService;
    }




}
