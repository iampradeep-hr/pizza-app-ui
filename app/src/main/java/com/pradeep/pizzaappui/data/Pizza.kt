package com.pradeep.pizzaappui.data

import androidx.annotation.DrawableRes
import com.pradeep.pizzaappui.R

data class Pizza(
    @DrawableRes val image:Int,
    val name:String,
    val description:String,
    val price:String,

)

val pizzaList= listOf<Pizza>(
    Pizza(
        R.drawable.p1,
        "Fresh Farm House",
        "crisp capsicum, succulent mushrooms and fresh tomatoes",
        "£14.25"
    ),
    Pizza(
        R.drawable.p2,
        "Peppy Paneer",
        "Chunky paneer with crisp capsicum and spicy red pepper",
        "£16.75"
    ),
    Pizza(
        R.drawable.p3,
        "Mexican Green Wave",
        "A pizza loaded with crunchy onions, crisp capsicum, juicy tomatoes",
        "£10.25"
    ),
    Pizza(
        R.drawable.p3,
        "Fresh Farm House",
        "crisp capsicum, succulent mushrooms and fresh tomatoes",
        "£14.25"
    ),
    Pizza(
        R.drawable.p4,
        "Fresh Farm House",
        "crisp capsicum, succulent mushrooms and fresh tomatoes",
        "£14.25"
    ),
    Pizza(
        R.drawable.p1,
        "Peppy Paneer",
        "Chunky paneer with crisp capsicum and spicy red pepper",
        "£19.25"
    ),
    Pizza(
        R.drawable.p3,
        "Fresh Farm House",
        "crisp capsicum, succulent mushrooms and fresh tomatoes",
        "£14.25"
    ),
    Pizza(
        R.drawable.p4,
        "Fresh Farm House",
        "crisp capsicum, succulent mushrooms and fresh tomatoes",
        "£14.25"
    ),
)
