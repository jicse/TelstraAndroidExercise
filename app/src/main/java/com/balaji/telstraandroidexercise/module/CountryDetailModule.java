package com.balaji.telstraandroidexercise.module;

import com.balaji.telstraandroidexercise.service.CountryDetailService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by balaji on 7/3/18.
 */

@Module
public class CountryDetailModule {
    public String BASE_URL;

    public CountryDetailModule(String BASE_URL){
        this.BASE_URL = BASE_URL;
    }

    @Provides
    public CountryDetailService.CountryServiceAPI provideApiService() {
        return provideRetrofit(BASE_URL).create(CountryDetailService.CountryServiceAPI.class);
    }

    @Provides
    public Retrofit provideRetrofit(String baseURL) {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
