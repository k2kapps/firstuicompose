package com.skyiot.firstuicompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting2(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 10.dp)){
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Red, fontSize = 45.sp)
                ){
                    append("R")
                }
                append("oyal")
                withStyle(style = SpanStyle(
                    color = Color.Red, fontSize = 40.sp)
                ){
                    append("P")
                }
                append("alm")
            },
            color = Color.DarkGray,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline

        )

    }
}