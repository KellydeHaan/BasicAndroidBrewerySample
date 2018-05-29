package com.kgalligan.basicandroid;

import com.kgalligan.basicandroid.shared.Urls;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitService {

    private BreweryApi breweryApi;

    public RetrofitService() {}

    private BreweryApi getBreweryApi() {
        if (breweryApi == null) {

            Retrofit adapter = new Retrofit.Builder()
                    .baseUrl(Urls.ENDPOINT)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

            breweryApi = adapter.create(BreweryApi.class);
        }

        return breweryApi;
    }

    public Single<String> getBreweriesFromNetwork() {
        // uses response body to test BreweryDecoder.
        return getBreweryApi().getBreweries()
                .map(ResponseBody::string)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<String> getBeersFromNetwork() {
        return getBreweryApi().getBeers()
                .map(ResponseBody::string)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}