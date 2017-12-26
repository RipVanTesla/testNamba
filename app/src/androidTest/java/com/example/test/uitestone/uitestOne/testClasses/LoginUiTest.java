package com.example.test.uitestone.uitestOne.testClasses;


import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObjectNotFoundException;

import com.example.test.uitestone.uitestOne.basicClasses.ActivitiesApp;
import com.example.test.uitestone.uitestOne.basicClasses.StartMainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)



public class LoginUiTest extends ActivitiesApp {

    @Before
    public void startMainActivity() {
        StartMainActivity mainActivity = new StartMainActivity();
        mainActivity.startMainActivity();
    }

    @Test
    public void chooseCountry() throws UiObjectNotFoundException {
        codeCountryField().clickAndWaitForNewWindow();
        assertTrue("Action bar root not enabled", actionBarRoot().isEnabled());
    }

    @Test
    public void checkTextCounter() throws UiObjectNotFoundException {
        codeCountryField().clickAndWaitForNewWindow();

        assertTrue("Not valid text number region KG", RegionNumberText1(0)
                .getText().contains("Кыргызстан (+996)"));
        assertTrue("Not valid text number region RU", RegionNumberText1(1)
                .getText().contains("Россия (+7)"));
    }
}