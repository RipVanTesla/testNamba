package com.example.test.uitestone.uitestOne.basicClasses;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

public class ActivitiesApp extends StartMainActivity {

    public static UiObject codeCountryField(){
        return Selectors.selectorById("co.namba1.dev:id/country");
    }

    public static UiObject actionBarRoot(){
        return Selectors.selectorById("co.namba1.dev:id/select_dialog_listview");
    }

    public static UiObject RegionNumberText1(int i) throws UiObjectNotFoundException {
        return Selectors.selectorById("co.namba1.dev:id/select_dialog_listview").getChild(new UiSelector().index(i));
    }

    public static UiObject RegionNumberText2(){
        return Selectors.selectorById("co.namba1.dev:id/text2");
    }
}
