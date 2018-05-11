package com.guideonline.example.android.guideonline.ui.Map;


import android.util.Log;

import com.guideonline.example.android.guideonline.api.App;
import com.guideonline.example.android.guideonline.model.ModelPoint;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapPrezenter {

    void startLoad(){
        App.getApi().getMap().enqueue(new Callback<ArrayList<ModelPoint>>() {
            @Override
            public void onResponse(Call<ArrayList<ModelPoint>> call, Response<ArrayList<ModelPoint>> response) {
                if(response.code()==200){
                    
                }
                else{

                }
            }

            @Override
            public void onFailure(Call<ArrayList<ModelPoint>> call, Throwable t) {

            }
        });
    }
}
