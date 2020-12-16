package com.example.trackerlist

import android.widget.RelativeLayout
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers
import org.hamcrest.core.AllOf.allOf
import org.hamcrest.core.IsInstanceOf

fun addItem(func: AddItemRobot.() -> Unit) = AddItemRobot().apply { func() }

class AddItemRobot : BaseRobot() {
    fun addItemToWorkTrackerRobot(text: String) {
        onView(withId(R.id.workAddItemEditText))
                .perform(click())
                .perform(typeText(text))
        onView(withId(R.id.workAddButton))
                .perform(click())
//        onView(withIndex(withText(text), 0)).check(matches(isDisplayed()))
//        onView(allOf(withId(R.id.workTrackerListView), hasSibling(withText(ItemData.KEYS.item))))
    }

    fun checkItemAtPositionInList(text: String, index: Int) {
        onView(withIndex(withText(text), index)).check(matches(isDisplayed()))
    }

    fun checkItemAtPos2(text: String) {
        allOf(withId(android.R.id.text1), withText(text),
                withParent(allOf(withId(R.id.workTrackerListView),
                        withParent(IsInstanceOf.instanceOf(RelativeLayout::class.java)))),
                isDisplayed())
    }


}