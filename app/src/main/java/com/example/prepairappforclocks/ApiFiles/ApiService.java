package com.example.prepairappforclocks.ApiFiles;

import com.example.prepairappforclocks.LoginFiles.LoginRequest;
import com.example.prepairappforclocks.LoginFiles.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/auth/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

}
