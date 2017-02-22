package com.echagnas.testdagger2;

import dagger.Component;

/**
 * Created by emmanuel on 22/02/17.
 */
@Component(modules = PresentationModule.class)
public interface PresentationComponent {
    void inject(MainActivity mainActivity);
}
