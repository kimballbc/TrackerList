package com.example.trackerlist.Robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId

fun mainRobot(func: MainActivityRobot.() -> Unit) = MainActivityRobot().apply { func() }

class MainActivityRobot : BaseRobot() {
    fun checkIdWithString(id: Int, text: String) {
        onView(withId(id))
                .check(matches(ViewMatchers.withText(text)))
    }

    fun swipeToHomeTracker(id1: Int, id2: Int, text: String) {
        onView(withId(id1))
                .perform(swipeLeft())
        onView(withId(id2))
                .check(matches(ViewMatchers.withText(text)))
    }

}

