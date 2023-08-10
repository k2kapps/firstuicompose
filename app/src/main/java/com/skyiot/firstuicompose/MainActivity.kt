package com.skyiot.firstuicompose

import android.app.DatePickerDialog
import android.app.ProgressDialog.show
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.DatePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.skyiot.firstuicompose.ui.theme.FirstuicomposeTheme
import java.util.*
import kotlin.coroutines.jvm.internal.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstuicomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                        Greeting()
                        Greeting2()
                        Dropdown()
                        Dropdown2()
                    showDateScreen(this)
                    showTimeScreen(this)
                      //MainScreen()
                }
            }
        }
    }
}

@Composable
fun showDateScreen(context: Context){

    val year: Int
    val month: Int
    val day: Int

    val calendar = Calendar.getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)
    calendar.time = Date()

    val date = remember { mutableStateOf("") }
    val datePickerDialog = DatePickerDialog(
        context,
        { _: DatePicker, year: Int, month:Int, dayOfMonth:Int ->
            date.value = "$dayOfMonth/$month/$year"
        },year,month,day
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .padding(bottom = 250.dp),
         verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "SelectedDate:${date.value}"
            , fontWeight = FontWeight.Bold, modifier = Modifier
                .border(width = 1.dp, color = Color.Black))
        Spacer(modifier = Modifier.size(6.dp))
        Button(onClick = {
            datePickerDialog.show()
        }) {
            Text(text = "Pick Date",
            fontSize = 20.sp)

        }
    }
}

@Composable
fun showTimeScreen(context: Context) {

    val calendar = Calendar.getInstance()
    val hour = calendar.get(Calendar.HOUR_OF_DAY)
    val minute = calendar.get(Calendar.MINUTE)

    val time = remember { mutableStateOf("") }
    val timePickerDialog = TimePickerDialog(
        context,
        { _, hour: Int, minute: Int ->
            time.value = "$hour:$minute"
        }, hour, minute, true
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(40.dp)
        .padding(bottom = 230.dp ),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Text(text = "SelectedTime: ${time.value}", fontWeight = FontWeight.Bold, modifier = Modifier
            .border(width = 1.dp, color = Color.Black))
        Spacer(modifier = Modifier.size(6.dp))
        Button(onClick = {
            timePickerDialog.show()
        }) {
            Text(text = "Pick Time",
            fontSize = 20.sp)
        }
    }
    Spacer(
        modifier = Modifier.height(10.dp))
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 180.dp )
        .padding(horizontal = 40.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White, backgroundColor = Color.Gray
            ),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(text = "Save",
                fontSize = 23.sp)

        }
    }

}




/*@Composable
fun Home() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Home")
    }

}
@Composable
fun NavigationController(navController: NavHostController){
    // NavHost(navController = NavHostController,StartDestination = NavigationItem.Home.route)

}

@Composable
    fun Notification() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Notification")

        }

    }

}
@Composable
fun Settings()
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Settings")

        }

    }

}

@Composable
fun Account()
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Account")
        }

    }

}
*/
