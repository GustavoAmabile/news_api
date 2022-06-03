package com.dio.testeapi.data.remote;

import com.dio.testeapi.domain.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
