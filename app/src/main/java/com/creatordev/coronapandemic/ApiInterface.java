package com.creatordev.coronapandemic;

import com.creatordev.coronapandemic.RetrofitAllWorldModel.Getworlddetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ApiInterface {

    //to get all reports of the world
    @GET("all")
    Call<Getworlddetails> getalldet(@Header("Authorization") String header);

    @GET("countries/{country}")
    Call<Getpartcountrydet> getcountrydet(@Path("country") String country);

}
