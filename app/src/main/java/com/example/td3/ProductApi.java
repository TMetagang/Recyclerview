package com.example.td3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductApi {

    @GET("/API/MostPopularTVs/k_8rZ9Ie4z")
    Call<RestMakeUpResponse> getProductResponse();

}
