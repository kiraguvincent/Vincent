package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vincent.ui.theme.Pink
import com.example.vincent.ui.theme.VincentTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Second()

        }
    }
}

@Composable
fun Second(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Pink),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.j1),
                contentDescription = "j2",

                modifier = Modifier
                    .size(200.dp)
                    .fillMaxSize()
                    .clip(shape = (CircleShape)),


                contentScale = ContentScale.Crop,



                )

            Text(
                text = "Let's plan your next vaccation",
                fontSize = 35.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

        }
        //End of box
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Choose your product")
        Text(text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias deserunt magni non nostrum voluptatibus? Autem dolor explicabo, facilis laudantium, libero maxime molestiae molestias necessitatibus numquam quidem ratione sint vero voluptates")


        val mContext = LocalContext.current


        Button(onClick = {             mContext.startActivity(Intent(mContext,ThirdActivity::class.java))

        },
            shape= RoundedCornerShape(10.dp),
            colors= ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        )
        {
            Text(text = "NEXT ")

        }



        Spacer(modifier = Modifier.height(10.dp))







    }

}




@Preview(showBackground = true)
@Composable
fun SecondPreview(){
    Second()
}


