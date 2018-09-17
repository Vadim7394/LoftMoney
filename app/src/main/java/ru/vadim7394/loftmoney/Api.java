package ru.vadim7394.loftmoney;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 17.09.2018.
 */

public interface Api {

    @GET("items")
    Call<List<Item>> getItems(@Query("type") String type);
}
