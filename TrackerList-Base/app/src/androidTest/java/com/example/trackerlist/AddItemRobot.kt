package com.example.trackerlist

import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.allOf

fun addItem(func: AddItemRobot.() -> Unit) = AddItemRobot().apply { func() }

class AddItemRobot {
    fun addItemToWorkTrackerRobot(text: String) {
        onView(withId(R.id.workAddItemEditText))
            .perform(click())
            .perform(typeText(text))

        onView(withId(R.id.workAddButton))
            .perform(click())

//        onView(withId(R.id.workTrackerListView))
//            .check(matches(hasChild(withText(text))))
//        onData(withId(R.id.workTrackerListView))
//            .onChildView(withText("keys"))

        onView(allOf(withId(R.id.workTrackerListView)))
            .check(matches(hasSibling((withText("keys")))))
        


    }


}