package com.example.trackerlist.Robots

fun removeItem(func: RemoveItemRobot.() -> Unit) = RemoveItemRobot().apply { func() }

class RemoveItemRobot : BaseRobot() {
    fun removeItemFromWorkTrackerRobot() {

    }
}