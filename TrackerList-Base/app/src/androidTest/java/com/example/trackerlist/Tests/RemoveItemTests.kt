package com.example.trackerlist.Tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.trackerlist.MainActivity
import com.example.trackerlist.Robots.removeItem
import org.junit.Rule
import org.junit.Test

class RemoveItemTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun removeItemFromWorkTracker() {
        removeItem {
            removeItemFromWorkTrackerRobot()
        }

    }
}