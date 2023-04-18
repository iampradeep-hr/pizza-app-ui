package com.pradeep.pizzaappui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
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
import com.pradeep.pizzaappui.ui.theme.ChipsColor
import com.pradeep.pizzaappui.ui.theme.OnPrimary
import com.pradeep.pizzaappui.ui.theme.Primary
import com.pradeep.pizzaappui.ui.theme.PrimaryContainer
import com.pradeep.pizzaappui.ui.theme.SurfaceColor

@Composable
fun HomeScreen() {

    val menuList = listOf<String>(
        "Starter",
        "Asian",
        "Classic",
        "Italian",
        "Chicago",
        "French",
        "Neapolitan"
    )

    var currentMenuState by remember {
        mutableStateOf("Starter")
    }
    val scrollState = rememberScrollState()


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundColor)
    ) {
        Column() {
            PizzaHeader()

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(scrollState)
                        .background(BackGroundColor)
                ) {
                    menuList.forEach { it ->
                        CustomChips(
                            title = it,
                            selected = it == currentMenuState,
                            onValueChange = {
                                currentMenuState = it
                            })
                    }
                }
            }


        }
    }
}


@Composable
fun PizzaHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(BlueColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row {
                AppIconButton(icon = R.drawable.menu2, tint = Color.White) {

                }
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Pizzeria Paradiso", style = TextStyle(
                        fontSize = 19.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.White
                    )
                )
            }
            AppIconButton(icon = R.drawable.search, tint = Color.White) {

            }
        }
    }
}


@Composable
fun CustomChips(
    title: String,
    selected: Boolean,
    onValueChange: (String) -> Unit
) {
    TextButton(
        onClick = {
            onValueChange(title)
        },
        shape = RoundedCornerShape(100.dp),
        elevation = ButtonDefaults.buttonElevation(
            0.dp
        ),
        colors = ButtonDefaults.buttonColors(
            if (selected) OnPrimary else Color.Transparent
        ),
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp)

    ) {
        Text(
            text = title, style = TextStyle(
                fontSize = 14.sp,

                fontWeight = FontWeight.W600,
                color = Color.White
            )
        )

    }

}