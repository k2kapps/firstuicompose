package com.skyiot.firstuicompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarScreen(
    val route:String,
    var title:String,
    val icon: ImageVector
){

    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
       icon = Icons.Default.Home
    )
    object Notification:BottomBarScreen(
        route = "Notification",
        title = "Notification",
        icon = Icons.Default.Notifications
    )
    object Account:BottomBarScreen(
        route = "Account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
    object Settings:BottomBarScreen(
        route = "Settings",
        title = "Settings",
        icon = Icons.Default.Settings)



}
