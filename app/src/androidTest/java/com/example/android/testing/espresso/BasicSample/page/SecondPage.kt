package com.example.android.testing.espresso.BasicSample.page

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R

class SecondPage {

    fun clickListButton () {
        onView(withId(R.id.listActivityBtn)).perform(click())
    }

    fun clickHomeButton() {
        onView(withId(R.id.mainActivityBtn)).perform(click())
    }
    fun showText(): ViewInteraction {
        return onView(withId(R.id.show_text_view))
    }
}