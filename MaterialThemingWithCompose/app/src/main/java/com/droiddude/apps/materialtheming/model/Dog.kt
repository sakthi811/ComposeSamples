package com.droiddude.apps.materialtheming.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)