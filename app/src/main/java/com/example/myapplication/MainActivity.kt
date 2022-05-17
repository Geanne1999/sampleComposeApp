package com.example.myapplication

import android.app.Notification
import android.graphics.fonts.FontFamily
import android.media.Image
import android.media.tv.TvContract
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.text.font.FontFamily.Companion.Serif
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            /*MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }*/



        }
    }
}

@Preview (showSystemUi = true) // to show the system UI
@Composable
fun PreviewInitialPage(){
    //pageInitiale(msg =mes)
    var obj=LogoCompose()
    obj.LogCompose()
    var mes=com.example.myapplication.Mes("","Podiactiv")
    var messag=com.example.myapplication.Message()
    messag.MessageCard(msg = mes)
}

/*fun PreviewMessageCard(){
    var mes=com.example.myapplication.Message("Geanne","Learning to work with compose")
    MessageCard(msg = mes)
}*/
/*@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}*/