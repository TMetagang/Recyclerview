package com.example.td3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductApi {

    @GET("/api/v1/products.json")
    Call<List<product>> ProductResponse();

}
