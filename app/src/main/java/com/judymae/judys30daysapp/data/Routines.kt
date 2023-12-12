package com.judymae.judys30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.judymae.judys30daysapp.R


data class Routines (
    @DrawableRes val imageResourceId: Int,
    @StringRes val routineTitle: Int,
    @StringRes val routineDescription: Int
)

val routines = listOf(
    Routines(R.drawable.picture1, R.string.routine_title_1, R.string.routine_description_1),
    Routines(R.drawable.picture2, R.string.routine_title_2, R.string.routine_description_2),
    Routines(R.drawable.picture3, R.string.routine_title_3, R.string.routine_description_3),
    Routines(R.drawable.picture4, R.string.routine_title_4, R.string.routine_description_4),
    Routines(R.drawable.picture5, R.string.routine_title_5, R.string.routine_description_5),
    Routines(R.drawable.picture6, R.string.routine_title_6, R.string.routine_description_6),
    Routines(R.drawable.picture7, R.string.routine_title_7, R.string.routine_description_7),
    Routines(R.drawable.picture8, R.string.routine_title_8, R.string.routine_description_8),
    Routines(R.drawable.picture9, R.string.routine_title_9, R.string.routine_description_9),
    Routines(R.drawable.picture10, R.string.routine_title_10, R.string.routine_description_10),
    Routines(R.drawable.picture11, R.string.routine_title_11, R.string.routine_description_11),
    Routines(R.drawable.picture12, R.string.routine_title_12, R.string.routine_description_12),
    Routines(R.drawable.picture13, R.string.routine_title_13, R.string.routine_description_13),
    Routines(R.drawable.picture14, R.string.routine_title_14, R.string.routine_description_14),
    Routines(R.drawable.picture15, R.string.routine_title_15, R.string.routine_description_15),
    Routines(R.drawable.picture16, R.string.routine_title_16, R.string.routine_description_16),
    Routines(R.drawable.picture17, R.string.routine_title_17, R.string.routine_description_17),
    Routines(R.drawable.picture18, R.string.routine_title_18, R.string.routine_description_18),
    Routines(R.drawable.picture19, R.string.routine_title_19, R.string.routine_description_19),
    Routines(R.drawable.picture20, R.string.routine_title_20, R.string.routine_description_20),
    Routines(R.drawable.picture21, R.string.routine_title_21, R.string.routine_description_21),
    Routines(R.drawable.picture22, R.string.routine_title_22, R.string.routine_description_22),
    Routines(R.drawable.picture23, R.string.routine_title_23, R.string.routine_description_23),
    Routines(R.drawable.picture24, R.string.routine_title_24, R.string.routine_description_24),
    Routines(R.drawable.picture25, R.string.routine_title_25, R.string.routine_description_25),
    Routines(R.drawable.picture26, R.string.routine_title_26, R.string.routine_description_26),
    Routines(R.drawable.picture27, R.string.routine_title_27, R.string.routine_description_27),
    Routines(R.drawable.picture28, R.string.routine_title_28, R.string.routine_description_28),
    Routines(R.drawable.picture29, R.string.routine_title_29, R.string.routine_description_29),
    Routines(R.drawable.picture30, R.string.routine_title_30, R.string.routine_description_30)
)