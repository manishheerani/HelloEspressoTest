package com.example.startup;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
    @LargeTest
    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class MainActivityTest {

        @Rule
        public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
                MainActivity.class);

        @Test
        public void greet() {
          onView(withId(R.id.hello_txt))
            .check(matches(withText("")));

          onView(withId(R.id.press))
                    .perform(click());

            onView(withId(R.id.hello_txt))
                    .check(matches(withText(R.string.hello_txt)));

        }
}