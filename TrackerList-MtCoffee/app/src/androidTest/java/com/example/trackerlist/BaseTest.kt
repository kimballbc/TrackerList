package com.example.trackerlist

import androidx.appcompat.app.AppCompatActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Before
import org.junit.Rule

open class BaseTest<T :AppCompatActivity>(
    private val activity: Class<T>,
    initialTouchMode: Boolean = true,
    launchActivity: Boolean = true) {

    @get:Rule
    val mainActivityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }
}