package com.kgalligan.basicandroid.shared;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreweryDecoder {

    private Gson gson = new Gson();

    public List<Brewery> combineFromJson(String breweries, String beers) {
        return combine(gson.fromJson(breweries, BreweryResponse.class).getBreweries(), gson.fromJson(beers, BeerResponse.class).getBeers());
    }

    private static List<Brewery> combine(List<Brewery> breweries, List<Beer> beers) {

        Map<String, List<Beer>> beerMap = new HashMap<>(breweries.size());
        for (Beer beer : beers) {
            List<Beer> list = beerMap.get(beer.getBrewery());

            if (list == null) {
                list = new ArrayList<>(beers.size());
                beerMap.put(beer.getBrewery(), list);
            }

            list.add(beer);
        }

        for (Brewery brewery : breweries) {
            brewery.setBeers(beerMap.get(brewery.getName()));
        }

        return breweries;
    }

}