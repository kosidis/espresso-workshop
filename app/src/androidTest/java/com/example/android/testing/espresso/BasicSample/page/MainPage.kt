package com.example.android.testing.espresso.BasicSample.page

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R

class MainPage {

    fun typeText(text:String) {
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(
                ViewActions.typeText(text),
                ViewActions.closeSoftKeyboard()
            )
    }

    fun clickChangeButton() {
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt)).perform(ViewActions.click())
    }

    fun getTextChanged() : ViewInteraction {
        return Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))

    }
}