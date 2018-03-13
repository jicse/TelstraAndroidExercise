package com.balaji.telstraandroidexercise.component;


import com.balaji.telstraandroidexercise.activity.MainActivity;
import com.balaji.telstraandroidexercise.module.CountryDetailModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by balaji on 18/12/17.
 */

@Singleton
@Component(modules = {CountryDetailModule.class,})
public interface AppComponent {
    void inject(MainActivity target);
}