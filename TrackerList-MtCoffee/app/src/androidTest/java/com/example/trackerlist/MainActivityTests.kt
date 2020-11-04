package com.example.trackerlist

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.trackerlist.utils.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class MainActivityTests : BaseTest<MainActivity>(MainActivity::class.java) {

    @Test
    fun verifyWorkTitleAndSubtitle(){
        onView(withId(R.id.workAppNameTextView)).check(matches(withText(WORK_TAB_TITLE)))
        onView(withId(R.id.workAppSubtitleTextView)).check(matches(withText(WORK_TAB_SUBTITLE)))
        idWithText
    }


}