package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.vincent.ui.theme.VincentTheme

class LottieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLottie()

        }
    }
}

@Composable
fun MyLottie(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,

            //End of lottie
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text ="Plan your next trip!" ,
            fontWeight = FontWeight.ExtraBold,
            fontSize =30.sp )

        Spacer(modifier = Modifier.height(10.dp))

        val mContext = LocalContext.current

        Button(onClick = {              mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
        },
            shape= RectangleShape,
            colors= ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.align(Alignment.CenterHorizontally))
        {
            Text(text = "DESTINATION")
        }


        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {              mContext.startActivity(Intent(mContext,ExploreActivity::class.java))
        },
            shape= RectangleShape,
            colors= ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.align(Alignment.CenterHorizontally))
        {
            Text(text = "DESTINATION")
        }
    }


}
@Preview(showBackground = true)
@Composable
fun MyLottiePreview() {
    MyLottie()

}