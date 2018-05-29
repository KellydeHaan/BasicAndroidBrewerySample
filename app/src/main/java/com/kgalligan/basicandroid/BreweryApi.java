package com.kgalligan.basicandroid;

import com.kgalligan.basicandroid.shared.BeerResponse;
import com.kgalligan.basicandroid.shared.BreweryResponse;
import com.kgalligan.basicandroid.shared.Urls;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.GET;


public interface BreweryApi {

    @GET(Urls.BREWERY)
    Single<ResponseBody> getBreweries();

    @GET(Urls.BEER)
    Single<ResponseBody> getBeers();
}
