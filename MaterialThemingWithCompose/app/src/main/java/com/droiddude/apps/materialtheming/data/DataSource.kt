package com.droiddude.apps.materialtheming.data

import com.droiddude.apps.materialtheming.R
import com.droiddude.apps.materialtheming.model.Dog

object DataSource {
    val dogs = listOf(
        Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
        Dog(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2),
        Dog(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3),
        Dog(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4),
        Dog(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5),
        Dog(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
        Dog(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7),
        Dog(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8),
        Dog(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9)
    )
}