package com.example.appofsuperheroes_josemgm.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val superheroeName:Int,
    @StringRes val description:Int,
    @DrawableRes val image:Int
)
