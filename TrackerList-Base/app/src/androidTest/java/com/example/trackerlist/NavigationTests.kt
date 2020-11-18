package com.example.trackerlist

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun homeTrackerScreenDisplaysWhenHomeTrackerTabIsTapped() {
        navigate {
            goToHomeTracker()
            matchScreen(R.id.homeAppSubtitleTextView,"House chores")
        }
    }

    @Test
    fun shoppingTrackerScreenDisplaysWhenShoppingTrackerTabIsTapped() {
        navigate {
            goToShoppingTracker()
            matchScreen(R.id.shoppingAppSubtitleTextView,"Don't forget to buy me")
        }
    }

    @Test
    fun workTrackerScreenDisplaysWhenWorkTrackerTabIsTapped() {
        navigate {
            goToWorkTracker()
            matchScreen(R.id.workAppSubtitleTextView,"Stuff to get done at work")
        }
    }


}