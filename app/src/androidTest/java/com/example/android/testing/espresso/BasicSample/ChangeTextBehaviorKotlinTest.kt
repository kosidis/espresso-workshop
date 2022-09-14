package com.example.android.testing.espresso.BasicSample

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.page.ListPage
import com.example.android.testing.espresso.BasicSample.page.MainPage
import com.example.android.testing.espresso.BasicSample.page.SecondPage
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Allure.step
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorKotlinTest {

    val operationSystem: String = "Android"
    val toastMessage: String = "Android selected"

    /**
     * Use [ActivityScenarioRule] to create and launch the activity under test before each test,
     * and close it after each test. This is a replacement for
     * [androidx.test.rule.ActivityTestRule].
     */
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()


    @Test
    fun changeText_sameActivity() {

        // Type text and then press the button.
        val mainPage = MainPage()
        mainPage.typeText(STRING_TO_BE_TYPED)


        mainPage.clickChangeButton()

        // Check that the text was changed.
        mainPage.getTextChanged()
            .check(ViewAssertions.matches(ViewMatchers.withText(STRING_TO_BE_TYPED)))


        mainPage.typeText(NEW_STRING_TO_BE_TYPED)
        //mainPage.clickChangeButton()
        mainPage.newTextChanged()
            .check(ViewAssertions.matches(ViewMatchers.withText(NEW_STRING_TO_BE_TYPED)))
    }

    @Test
    fun changeText_newActivity() {
        // Type text and then press the button.
        //onView(withId(R.id.editTextUserInput)).perform(typeText(STRING_TO_BE_TYPED),
        step("Go to Main Page")
        val mainPage = MainPage()
        val secondPage = SecondPage()

        step("Go to Main Page")
        mainPage.typeText(STRING_TO_BE_TYPED)
        mainPage.clickActivityButton()
        //onView(withId(R.id.activityChangeTextBtn)).perform(click())

        // This view is in a different Activity, no need to tell Espresso.
        //onView(withId(R.id.show_text_view)).check(matches(withText(STRING_TO_BE_TYPED)))

        secondPage.showText().check(ViewAssertions.matches(ViewMatchers.withText(STRING_TO_BE_TYPED)))
        secondPage.clickListButton()

        val listPage = ListPage()
        listPage.checkView()

        @Test
        fun test() {



        }




        //val dataInteraction = onData(allOf())
        // onData(allOf(`is`(instanceOf(String.javaClass)), startsWith(operationSystem))).perform(click())
        // val dataInt = onData(allOf(`is`(instanceOf(String::class.java))))
        //.perform(click())
        /*onData(withItemContent())
            .onChildView(withText(operationSystem))
            .perform(click())*/

        //onView(withText(toastMessage))
        // .inRoot(ToastMessage())
        //.check(matches(isDisplayed()))




    }
    @Test
    fun goToList() {

    }



    companion object {

        val STRING_TO_BE_TYPED = "Espresso"
        val NEW_STRING_TO_BE_TYPED = "Espresso New"
    }


}