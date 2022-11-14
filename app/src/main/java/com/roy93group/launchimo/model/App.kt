package com.roy93group.launchimo.model

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.annotation.Keep

@Keep
data class App(
    val label: String,
    val pkgName: String,
    val icon: Drawable,
    val intent: Intent
)
