package com.example.myapplication

import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class LogoCompose {
    @Composable
    fun LogCompose(){
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.logopodiactivfinalsope),
                contentDescription = null,
                modifier = Modifier
                    .absolutePadding(115.dp, 180.dp, 50.dp, 0.dp)
                    .size(150.dp)
                    .clip(RectangleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}