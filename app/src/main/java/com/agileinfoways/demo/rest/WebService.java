package com.agileinfoways.demo.rest;

import com.agileinfoways.demo.model.DemoModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WebService {

    //Create pin api
    @FormUrlEncoded
    @POST("create")
    Call<DemoModel> demo(@Field("internationalCode") String internationalCode, @Field("phone") String phone);

}