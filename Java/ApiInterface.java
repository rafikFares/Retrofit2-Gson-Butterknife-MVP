package com.example.paramedics.myrxjava;


import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import io.reactivex.Observable;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("tx_all_taxi.php")
    Call<Taxi> getUsers();


    @GET("/tx_all_taxi.php")
    Observable<Taxi> getUsersAsObservable();


    @GET("/tx_verification.php")
    Single<Taxi> txVerification(@Query("tel") String tel,
                                @Query("pass") String pass);

    @FormUrlEncoded
    @POST("insert_taxi_retrofit2.php")
    Call<Result> insertUser(
            @Field("name") String name,
            @Field("tel") String tel,
            @Field("code") int code,
            @Field("pass") String pass);

}


//retrofit 2
        /*
        www.app.net/api/searchtypes/862189/filters?Type=6&SearchText=School

        Now this is the call:

        @GET("/api/searchtypes/{Id}/filters")
        Call<FilterResponse> getFilterList(@Path("Id") long customerId,
                  @Query("Type") String responseType,
                  @Query("SearchText") String searchText);

        So we have:

        www.app.net/api/searchtypes/{Path}/filters?Type={Query}&SearchText={Query}

        Things that come after the ? are usually queries.
         */
