package com.example.numbersapiapp.network;

import com.example.numbersapiapp.model.Trivia;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NumbersService {
    @GET("/{inputNumber}/trivia")
    Call<Trivia> getTriviaData(@Path ("inputNumber") String inputNumber, @Query("json") String json);
}
