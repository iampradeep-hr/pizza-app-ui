package com.pradeep.pizzaappui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pradeep.pizzaappui.R
import com.pradeep.pizzaappui.common.AppIconButton
import com.pradeep.pizzaappui.ui.theme.BackGroundColor
import com.pradeep.pizzaappui.ui.theme.BlueColor

@Composable
fun HomeScreen() {


    Box(modifier = Modifier
        .fillMaxSize()
        .background(BackGroundColor)){
        Column() {
            PizzaHeader()
        }
    }
}


@Composable
fun PizzaHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(BlueColor)){
        Row (
            modifier=Modifier.fillMaxWidth().padding(vertical = 20.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
                ){

            Row {
                AppIconButton(icon = R.drawable.menu2, tint = Color.White){

                }
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Pizzeria Paradiso", style = TextStyle(
                    fontSize = 19.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                ))
            }
            AppIconButton(icon = R.drawable.search, tint = Color.White) {

            }
        }
    }
}


