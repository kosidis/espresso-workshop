package com.example.android.testing.espresso.BasicSample.page

import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import io.qameta.allure.kotlin.Allure

class MainPage {


    fun typeText(text:String) {
        Allure.step("Type text: $text")
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
    fun newTextChanged (): ViewInteraction {
        return Espresso.onView(ViewMatchers.withId(R.id.newTextToBeChanged))
    }

    fun clickActivityButton () {
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
    }


}