package com.echagnas.testdagger2;

import android.util.Log;

/**
 * Created by emmanuel on 22/02/17.
 */

public class PresentationBenoit implements PresentationInterface{
    @Override
    public void log() {
        Log.d("TestDagger2", "C'est Benoit");
    }
}
