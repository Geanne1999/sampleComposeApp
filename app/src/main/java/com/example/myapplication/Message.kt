package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Mes(val author:String, val body: String)
class Message {
    @Composable
    fun MessageCard(msg: com.example.myapplication.Mes){
        Text(text = msg.body,
            color= MaterialTheme.colors.secondaryVariant,
            style = MaterialTheme.typography.subtitle1,
            fontSize=25 .sp,
            modifier = Modifier
                .absolutePadding(145.dp,0.dp,50 .dp, 0.dp)
        )
    }
}