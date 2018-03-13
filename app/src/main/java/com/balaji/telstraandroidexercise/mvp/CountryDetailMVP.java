package com.balaji.telstraandroidexercise.mvp;


import com.balaji.telstraandroidexercise.model.Country;

/**
 * Created by balaji on 7/3/18.
 */

public interface CountryDetailMVP {

    void showLoader();

    void hideLoader();

    void onFailure(String errorMessage);

    void setCountryData(Country countryData);

    void setTitle(String title);
}
