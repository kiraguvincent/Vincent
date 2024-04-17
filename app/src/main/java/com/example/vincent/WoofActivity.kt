package com.example.vincent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vincent.ui.theme.VincentTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woofs()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Woofs(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext= LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Woof", color = Color.Black, fontFamily = FontFamily.Serif, fontWeight = FontWeight.ExtraBold) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {




                IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                Image(painter = painterResource(id = R.drawable.dogpaw),
                    contentDescription ="DogPaw" )
                }


                Spacer(modifier = Modifier.width(20.dp))







            },

        )

        //END OF TopAppBar

        IconButton(onClick = { mContext.startActivity(Intent(mContext, DestinationActivity::class.java))
        }) {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Menu",
                tint =Color.Blue)}

        Spacer(modifier = Modifier.height(5.dp))

        Column {

            //Row 1
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(text = "Koda")
                            Text(text = "2 Years Old ")
                        }
                    }

                    //The end of row 1

                    Spacer(modifier = Modifier.height(5.dp))


                }
            }

Spacer(modifier = Modifier.height(20.dp))
            //Row 2
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.bulldog),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Column {
                            Text(text = "Lola")
                            Text(text = "16 Years Old ")
                        }
                    }

                    //The end of row 2



                }

            }

            Spacer(modifier = Modifier.height(20.dp))


            //Row 3
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.germanshepherd),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(text = "Frankie")
                            Text(text = "2 Years Old ")
                        }
                    }

                    //The end of row 3

                    Spacer(modifier = Modifier.height(5.dp))


                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            //Row 4
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.germanshepherd),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Column {
                            Text(text = "Nox")
                            Text(text = "8 Years Old ")
                        }
                    }

                    //The end of row 4



                }

            }





            Spacer(modifier = Modifier.height(20.dp))


            //Row 5
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(text = "Faye")
                            Text(text = "8 Years Old ")
                        }
                    }

                    //The end of row 5

                    Spacer(modifier = Modifier.height(5.dp))


                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            //Row 6
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Column {
                            Text(text = "Bella")
                            Text(text = "14 Years Old ")
                        }
                    }

                    //The end of row 6



                }

            }

            Spacer(modifier = Modifier.height(20.dp))


            //Row 7
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(text = "Moana")
                            Text(text = "2 Years Old ")
                        }
                    }

                    //The end of row 7

                    Spacer(modifier = Modifier.height(5.dp))


                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            //Row 8
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Column {
                            Text(text = "Tzeitel")
                            Text(text = "7 Years Old ")
                        }
                    }

                    //The end of row 8

                    Spacer(modifier = Modifier.height(20.dp))


                }

            }



            Spacer(modifier = Modifier.height(20.dp))
            //Row 9
            Row {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                ) {


                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.siberian),
                            contentDescription = "",
                            modifier = Modifier.size(width = 200.dp, height = 200.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Column {
                            Text(text = "Koda")
                            Text(text = "2 Years Old ")
                        }
                    }

                    //The end of row 9

                    Spacer(modifier = Modifier.height(20.dp))


                }

            }







        }

        }


    }

@Preview(showBackground = true)
@Composable
fun WoofsPreview() {
    Woofs()

}