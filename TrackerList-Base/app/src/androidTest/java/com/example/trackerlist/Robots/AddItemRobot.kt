package com.example.trackerlist.Robots

import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.trackerlist.R
import com.example.trackerlist.utils.KEYS
import com.example.trackerlist.utils.PHONE
import com.example.trackerlist.utils.WALLET
import org.hamcrest.core.AllOf.allOf

fun addItem(func: AddItemRobot.() -> Unit) = AddItemRobot().apply { func() }

class AddItemRobot : BaseRobot() {
    fun addItemToTracker(text: String) {
        onView(withId(R.id.addItemEditText))
                .perform(click())
                .perform(typeText(text))
        onView(withId(R.id.addButton))
                .perform(click())
    }

    fun checkItemAtPositionInList(text: String, index: Int) {
        onData(allOf()).inAdapterView(withId(R.id.workTrackerListView))
                .atPosition(index)
                .check(matches(withText(text)))
    }

    fun loadList() {
        addItemToTracker(KEYS)
        addItemToTracker(WALLET)
        addItemToTracker(PHONE)
    }
}