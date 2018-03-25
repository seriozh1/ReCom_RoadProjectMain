package com.s.samsungitschool.roadprojectmain;


import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RequestRegistration {
    // TODO Change the server address after debug
    @FormUrlEncoded
    @POST("user")
    Call<Object> performPostCall(@FieldMap HashMap<String, String> loginPostDataParams,
                                 @FieldMap HashMap<String, String> emailPostDataParam,
                                 @FieldMap HashMap<String, String> passwordPostDataParams);
}
