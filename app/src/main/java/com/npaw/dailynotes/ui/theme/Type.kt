package com.npaw.dailynotes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import com.npaw.dailynotes.R.font


val openSans = FontFamily(
    Font(
        resId = font.open_sans_bold
                ,weight = FontWeight.Bold,
    ),
    Font(
        resId = font.open_sans_regular,
        weight = FontWeight.Normal,

    ),
    Font(
        resId = font.open_sans_etra_bold,
        weight = FontWeight.ExtraBold
    ),
    Font(
        resId = font.open_sans_light,
        weight = FontWeight.Light,

    ),
)



// Default Material 3 typography values
val baseline = Typography()

val Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = openSans),
    displayMedium = baseline.displayMedium.copy(fontFamily = openSans),
    displaySmall = baseline.displaySmall.copy(fontFamily = openSans),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = openSans),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = openSans),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = openSans),
    titleLarge = baseline.titleLarge.copy(fontFamily = openSans),
    titleMedium = baseline.titleMedium.copy(fontFamily = openSans),
    titleSmall = baseline.titleSmall.copy(fontFamily = openSans),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = openSans),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = openSans),
    bodySmall = baseline.bodySmall.copy(fontFamily = openSans),
    labelLarge = baseline.labelLarge.copy(fontFamily = openSans),
    labelMedium = baseline.labelMedium.copy(fontFamily = openSans),
    labelSmall = baseline.labelSmall.copy(fontFamily = openSans),
)

