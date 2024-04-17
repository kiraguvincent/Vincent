package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.vincent.ui.theme.VincentTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySplash()

            val mContext= LocalContext.current
            val coroutineScope= rememberCoroutineScope()
            coroutineScope.launch {  delay(1000)  }
            mContext.startActivity((Intent(mContext,MainActivity::class.java)))
            finish()


        }
    }
}

@Composable
fun MySplash(){
    Column(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.fortuner1),
            contentDescription = "Fortuner",
            modifier = Modifier.fillMaxSize(),


            )
    }

}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()

}
