package com.echagnas.testdagger2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by emmanuel on 22/02/17.
 */
@Module
public class PresentationModule {

    @Provides
    @Named("Charles")
    PresentationInterface providePresentationCharles(){
        return new PresentationCharles();
    }

    @Provides
    @Named("Benoit")
    PresentationInterface providePresentationBenoit(){
        return new PresentationBenoit();
    }
}
