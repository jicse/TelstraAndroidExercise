package com.balaji.telstraandroidexercise;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.balaji.telstraandroidexercise.utils.AppUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class CountryDataInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.balaji.telstraandroidexercise", appContext.getPackageName());
    }

    @Test
    public void testNetworkErrorWithNetwork() throws Exception{
        Context appContext = InstrumentationRegistry.getTargetContext();
        if(AppUtils.isNetworkAvailable(appContext)) {
            assertEquals("Not Found",AppUtils.formNetworkErrorText(appContext,"Not Found"));
        }

    }

    @Test
    public void testNetworkErrorWithoutNetwork() throws Exception{
        Context appContext = InstrumentationRegistry.getTargetContext();
        if(!AppUtils.isNetworkAvailable(appContext)) {
            assertEquals("Check Network", AppUtils.formNetworkErrorText(appContext,"Not Found"));
        }
    }

}
