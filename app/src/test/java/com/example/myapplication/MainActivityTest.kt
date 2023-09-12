package com.example.myapplication


import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.myapplication.view.MainActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText


import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun compararTexto_mostrarResultado() {

        onView(withId (R.id.ed1)).perform(typeText("hello"))

        onView(withId (R.id.ed2)).perform(typeText("hello"))

        onView(withId (R.id.bt1)).perform(click())

        onView(withId (R.id.tv1)).check(matches(withText("los testos son iguales")))


    }
}

