package com.example.crypto.service;

import com.example.crypto.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=919efb7de83aa1067dae0abc77aec205")
    Observable<List<CryptoModel>> getData();
}
