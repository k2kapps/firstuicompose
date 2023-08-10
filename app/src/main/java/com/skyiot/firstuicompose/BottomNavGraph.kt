package com.skyiot.firstuicompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.skyiot.firstuicompose.Screens.AccountScreen
import com.skyiot.firstuicompose.Screens.HomeScreen
import com.skyiot.firstuicompose.Screens.NotificationScreen
import com.skyiot.firstuicompose.Screens.SettingScreen


@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
     composable(route = BottomBarScreen.Home.route){
         HomeScreen()
     }
        composable(route = BottomBarScreen.Notification.route) {
           // NotificationScreen()
        }

       composable(route = BottomBarScreen.Account.route){
        //AccountScreen()

      }
        composable(route = BottomBarScreen.Settings.route){
         //SettingScreen()
      }

     }
}

