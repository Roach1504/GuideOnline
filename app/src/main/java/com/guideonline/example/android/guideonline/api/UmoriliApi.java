package com.guideonline.example.android.guideonline.api;


import com.guideonline.example.android.guideonline.model.ModelPoint;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UmoriliApi {

    @GET("web/?r=uudemap/default/get-info")
    Call<ArrayList<ModelPoint>> getMap();
}
