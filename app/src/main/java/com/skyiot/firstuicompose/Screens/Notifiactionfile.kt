package com.skyiot.firstuicompose.Screens

import android.app.Notification
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight


@Composable
fun NotificationScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Notification Page",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

    }
}