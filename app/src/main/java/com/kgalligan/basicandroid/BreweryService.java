package com.kgalligan.basicandroid;

import com.kgalligan.basicandroid.shared.Brewery;
import com.kgalligan.basicandroid.shared.BreweryDecoder;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class BreweryService {

    private RetrofitService apiClient = new RetrofitService();
    private BreweryDecoder decoder = new BreweryDecoder();

    public Single<List<Brewery>> get() {

        return Single.zip(apiClient.getBreweriesFromNetwork(),
                apiClient.getBeersFromNetwork(),
                (breweries, beers) -> decoder.combineFromJson(breweries, beers));

    }
}
