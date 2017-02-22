package com.echagnas.testdagger2;

/**
 * Created by emmanuel on 22/02/17.
 */

public class Application extends android.app.Application{

    protected PresentationComponent presentationComponent;
    protected static Application application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

        presentationComponent = DaggerPresentationComponent.builder().presentationModule(new PresentationModule()).build();
    }

    public static Application app(){
        return application;
    }

    public PresentationComponent component(){
        return presentationComponent;
    }
}
