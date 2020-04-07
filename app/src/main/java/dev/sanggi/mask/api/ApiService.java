package dev.sanggi.mask.api;

import dev.sanggi.mask.model.StoresResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("storesByGeo/json?m=1000")
    Call<StoresResponse> test(@Query("lat") double lat, @Query("lng") double lng);
}
