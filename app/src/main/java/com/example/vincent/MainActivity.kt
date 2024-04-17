package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vincent.ui.theme.VincentTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo() {
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current

        Text(text = "Welcome to android",
            color= Color.Red,
            fontSize=30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight=FontWeight.Bold)

        Column {

            Text(text = "Entails developing and creating mobile applicatons for android devices")



            val mContext = LocalContext.current
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {              mContext.startActivity(Intent(mContext,LottieActivity::class.java))
            },
                shape= RectangleShape,
                colors= ButtonDefaults.buttonColors(Color.Cyan),
                modifier = Modifier.align(Alignment.CenterHorizontally))
            {
                Text(text = "LOTTIE")
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
        Button(onClick = {              mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
        },
            shape= RectangleShape,
            colors=ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.align(Alignment.CenterHorizontally))
        {
            Text(text = "DESTINATION")

        }

        Spacer(modifier = Modifier.height(10.dp))


            Text(text = "Types of cars",
            fontSize=20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color=Color.White,
            fontWeight = FontWeight.Bold    )
        Text(text = "1.BMW")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Ferrari")
        Text(text = "4.Fortuner")


        Text(text = "ABOUT ANDROID DEVICES",
            fontSize=20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color=Color.White,
            fontWeight = FontWeight.Bold    )
        Text(text =
        "An Android phone is a powerful, high-tech smartphone that runs on the Android operating system (OS) developed by Google and is used by a variety of mobile phone manufacturers. Surprisingly, Android phones make up over 70% of all phones bought across the world, while Apple's iOS-powered iPhones only account for 27%.")


        Text(text = "Types of Android Phones",
            fontSize=20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color=Color.White,
            fontWeight = FontWeight.Bold    )
        Text(text = "1.Oppo")
        Text(text = "2.Samsung ")
        Text(text = "3.Nokia")
        Text(text = "4.Tecno")

        Spacer(modifier = Modifier.height(2.dp))
        Divider()
        Text(text = "eMobilis Mobile Training Institute",
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold)


 Box(modifier =Modifier.fillMaxWidth(),
     contentAlignment = Alignment.Center ){

     Spacer(modifier = Modifier.height(2.dp))
     Image(painter = painterResource(id = R.drawable.fourteen) ,
         contentDescription = "Waterfall",
         modifier = Modifier.size(200.dp))
 }


     
     Spacer(modifier = Modifier.height(10.dp))
     Button(
         onClick = {
             mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
         },
         shape = RoundedCornerShape(5.dp),
         colors = ButtonDefaults.buttonColors(Color.Red),
         modifier = Modifier
             .fillMaxWidth()
             .padding(start = 30.dp, end = 30.dp)
         ) {
         Text(text = "Continue")
     }


    }
}

@Preview(showBackground = true)
@Composable
fun Demopreview(){
    Demo()
}

