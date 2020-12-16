package com.example.trackerlist

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.core.AllOf.allOf

fun addItem(func: AddItemRobot.() -> Unit) = AddItemRobot().apply { func() }

class AddItemRobot : BaseRobot() {
    fun addItemToWorkTrackerRobot(text: String) {
        onView(withId(R.id.workAddItemEditText))
            .perform(click())
            .perform(typeText(text))

        onView(withId(R.id.workAddButton))
            .perform(click())
        onView(withIndex(withText("keys"), 0)).check(matches(isDisplayed()))

//        onView(allOf(withId(R.id.workTrackerListView), hasSibling(withText(ItemData.KEYS.item))))
        


    }


}