package com.example.trackerlist

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

fun navigate(func: NavigationRobot.() -> Unit) = NavigationRobot().apply { func() }

class NavigationRobot {
    fun goToWorkTracker(){
        onView(withText("Work Tracker"))
                .perform(click())
    }

    fun goToHomeTracker(){
        onView(withText("Home Tracker"))
                .perform(click())
    }

    fun goToShoppingTracker(){
        onView(withText("Shopping Tracker"))
                .perform(click())
    }

    fun matchScreen(id: Int , text: String) {
        onView(withId(id))
                .check(matches(withText(text)))
    }

}