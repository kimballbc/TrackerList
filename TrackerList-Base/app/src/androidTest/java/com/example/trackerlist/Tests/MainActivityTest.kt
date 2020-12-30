package com.example.trackerlist.Tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.trackerlist.MainActivity
import com.example.trackerlist.R
import com.example.trackerlist.Robots.mainRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun verifyHeaderSubtitle() {
        //onView(withId(R.id.workAppSubtitleTextView))
        //    .check(matches(withText("Stuff to get done at work")))
        mainRobot {
            checkIdWithString(R.id.workAppNameTextView, "Work Tracker")
        }
    }
    @Test
    fun swipeToHomeTracker(){
        mainRobot {
            swipeToHomeTracker(R.id.workTrackerListView, R.id.workAppNameTextView, "Work Tracker")
        }
    }
}