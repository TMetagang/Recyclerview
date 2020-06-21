package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
//import android.util.log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://imdb-api.com/";


    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("First", "oncreateb/4call");
        makeApiCall();
        showList();

    }

      private void showList() {

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            // use a linear layout manager
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            List<String> input = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                input.add("Test" + i);
            }// define an adapter

            mAdapter = new ListAdapter(input);
            recyclerView.setAdapter(mAdapter);
        }



    private void makeApiCall() {

        Log.d("TAG", "BEGINAPI");
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

       Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();



        ProductApi productApi = retrofit.create(ProductApi.class);

        Call<RestMakeUpResponse> call = productApi.getProductResponse();


        call.enqueue(new Callback<RestMakeUpResponse>() {
            @Override
            public void onResponse(Call<RestMakeUpResponse> call, Response<RestMakeUpResponse> response) {



                if(response.isSuccessful() && response.body() != null){

                    List<product> pList = response.body().getResults();

                    Log.d("TAG", "after if");
                   /* if(pList.size() != 0){
                        Log.d("TAG2", "after if2");
                    }*/
                    Toast.makeText(getApplicationContext(), "API Success", Toast.LENGTH_SHORT).show();
                    showList();
                }else{
                    Log.d("TAG", "INELSE");
                    showError();
                   // Toast.makeText(getApplicationContext(), response.message(), Toast.LENGTH_SHORT).show();


                }
            }

            @Override
            public void onFailure(Call<RestMakeUpResponse> call, Throwable t) {
                Log.d("TAG", "InOnfailure");
                showError();
               // Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();


            }
        });


    }

    private void showError() {
       Toast.makeText(getApplicationContext(), "API Error", Toast.LENGTH_SHORT).show();
    }


}
