package com.skyiot.firstuicompose

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.widget.DatePicker
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import java.util.*

@Composable
fun Greeting() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp)
        .padding(vertical = 80.dp)
    ) {
        var text by remember { mutableStateOf("type here...") }
        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text = "Origin",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold)
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Column(modifier = Modifier
            .fillMaxSize()
            //.padding(horizontal = 20.dp)
            //.padding(vertical = 160.dp)
        ) {
            var text by remember { mutableStateOf("type here...") }

            OutlinedTextField(
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = {
                    Text(text = "Destination",
                        color = Color.Blue,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold)
                })
        }
    }
}
@Composable
fun Dropdown(){

    var expanded by remember { mutableStateOf(false) }
    val list = listOf("java","kotlin","c++","js","Sql","php","Android","Studio","etc")
    var selectedItem by remember{ mutableStateOf("") }

    var textFieldSize by remember{ mutableStateOf(Size.Zero) }

    val icon = if (expanded){
        Icons.Filled.KeyboardArrowUp
    }else{
        Icons.Filled.KeyboardArrowDown
    }


    Column(modifier = Modifier
        .padding(vertical = 240.dp)
        .padding(horizontal = 20.dp)) {

        androidx.compose.material.OutlinedTextField(
            value = selectedItem ,
            onValueChange = { selectedItem = it},
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                },
            label = { Text(text = "Tonague",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal) },
            trailingIcon = {
                Icon(icon, "", Modifier.clickable { expanded = !expanded })
            }
        )

        DropdownMenu(
            expanded =expanded ,
            onDismissRequest = { expanded = false},
            modifier = Modifier
                .width(with(LocalDensity.current){textFieldSize.width.toDp()})

        ) {
            list.forEach { label->
                DropdownMenuItem(onClick = {selectedItem = label
                    expanded = false
                }) {
                    Text(text = label)
                }
            }
        }
    }
}

@Composable
fun Dropdown2(){

    var expanded by remember { mutableStateOf(false) }
    val list = listOf("A","B","C","D","E","F","G","H","etc")
    var selectedItem by remember{ mutableStateOf("") }

    var textFieldSize by remember{ mutableStateOf(Size.Zero) }

    val icon = if (expanded){
        Icons.Filled.KeyboardArrowUp
    }else{
        Icons.Filled.KeyboardArrowDown
    }

    Column(modifier = Modifier
        .padding(vertical = 320.dp)
        .padding(horizontal = 20.dp)) {
        androidx.compose.material.OutlinedTextField(
            value = selectedItem ,
            onValueChange = { selectedItem = it},
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                },
            label = { Text(text = "Goods List",
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold) },
            trailingIcon = {
                Icon(icon, "", Modifier.clickable { expanded = !expanded })
            }
        )
        DropdownMenu(
            expanded =expanded ,
            onDismissRequest = { expanded = false},
            modifier = Modifier
                .width(with(LocalDensity.current){textFieldSize.width.toDp()})
        ) {
            list.forEach { label->
                DropdownMenuItem(onClick = {selectedItem = label
                    expanded = false
                }) {
                    Text(text = label)

                }
            }
        }
    }
}


fun OutlinedTextField(value: String, onValueChange: () -> Unit, modifier: Modifier, label: () -> Unit, trailingIcon: Unit) {

}

    //}

