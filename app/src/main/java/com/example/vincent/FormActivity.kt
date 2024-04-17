package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.vincent.ui.theme.VincentTheme

class VyKotlin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm()



        }
    }
}

@Composable
fun MyForm() {
    Column(modifier = Modifier.fillMaxSize()){

        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }
        val mContext = LocalContext.current


        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
            ){
            Image(
                painter = painterResource(id = R.drawable.register),
                contentDescription = "register",
                modifier = Modifier.size(180.dp)
            )

        }


        Text(
            text = "Create an Account",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier =Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =firstname ,
            onValueChange ={firstname=it},
            placeholder = { Text(text ="Firstname" )},
            leadingIcon = { Image(imageVector = Icons.Default.Person, contentDescription ="Person" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


        )

        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value =lastname ,
            onValueChange ={lastname=it},
            placeholder = { Text(text ="Lastname" )},
            leadingIcon = { Image(imageVector = Icons.Default.Person, contentDescription ="Person" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


        )

        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value =email ,
            onValueChange ={email=it},
            placeholder = { Text(text ="Email Address" )},
            leadingIcon = { Image(imageVector = Icons.Default.Email, contentDescription ="Email" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


        )

        Spacer(modifier = Modifier.height(10.dp))



        TextField(
            value =password ,
            onValueChange ={password=it},
            placeholder = { Text(text ="password" )},
            leadingIcon = { Image(imageVector = Icons.Default.Lock, contentDescription ="Password" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()


        )

        Spacer(modifier = Modifier.height(10.dp))



        OutlinedTextField(
            value =contact ,
            onValueChange ={contact=it},
            placeholder = { Text(text ="Contact" )},
            leadingIcon = { Image(imageVector = Icons.Default.Call, contentDescription ="Call" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)


        )




        Button(onClick = {
        },
            shape= RectangleShape,
            colors= ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        )
        {
            Text(text = "SIGN UP")

        }



        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Do not have an account?Register",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))

                },
            textAlign = TextAlign.Center

        )



        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Next",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable
            {
                    mContext.startActivity(Intent(mContext,WoofActivity::class.java))

                },
            textAlign = TextAlign.Center


        )







    }

}

@Preview(showBackground = true)
@Composable
fun MyFormPreview() {
    MyForm()

}