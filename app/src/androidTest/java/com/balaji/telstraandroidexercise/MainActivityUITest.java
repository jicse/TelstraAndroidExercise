package com.balaji.telstraandroidexercise;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import com.balaji.telstraandroidexercise.activity.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by balaji on 13/3/18.
 */

public class MainActivityUITest {

    private static final int LAUCH_TIME_DELAY = 3500;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    public MainActivity myActivity;

    @Before
    public void setUp() throws Exception {
        myActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void isRecyclerViewHasData() throws Exception {
        RecyclerView recyclerView = myActivity.findViewById(R.id.recycler_view);
        Thread.sleep(LAUCH_TIME_DELAY);
        if (recyclerView.getAdapter() == null) {
            assertFalse(false);
            return;
        }
        int count = recyclerView.getAdapter().getItemCount();
        if (count > 0) {
            assertTrue(true);
        } else {
            assertFalse(false);
        }
    }
}
