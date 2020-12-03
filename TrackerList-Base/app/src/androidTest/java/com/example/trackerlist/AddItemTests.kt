package com.example.trackerlist


import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class AddItemTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun addItemToWorkTracker() {
        addItem {
            addItemToWorkTrackerRobot("keys")
        }
    }
}