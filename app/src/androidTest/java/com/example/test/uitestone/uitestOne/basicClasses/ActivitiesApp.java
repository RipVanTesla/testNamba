package com.example.test.uitestone.uitestOne.basicClasses;

import android.support.test.uiautomator.UiObject;

public class ActivitiesApp extends StartMainActivity {

    public static UiObject codeCountryField(){
        return Selectors.selectorById("co.namba1.dev:id/country");
    }

    public static UiObject actionBarRoot(){
        return Selectors.selectorById("co.namba1.dev:id/action_bar_root");
    }
}
