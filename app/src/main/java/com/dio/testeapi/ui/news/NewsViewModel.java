package com.dio.testeapi.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dio.testeapi.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Spectacular!", "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...\""));
        news.add(new News("Extra!", "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...\""));
        news.add(new News("Unbelievable!", "\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...\""));

        this.news.setValue(news);
    }
        public LiveData<List<News>> getNews () {
            return news;
        }
}