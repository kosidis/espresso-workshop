package com.example.android.testing.espresso.BasicSample.page
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.collection.IsMapContaining.hasEntry


class ListPage {
    fun checkView() {
        onView(withId(R.id.icon))
        onView(withId(R.id.label))
    }

}