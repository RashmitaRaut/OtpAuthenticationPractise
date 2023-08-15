package com.example.otppractise.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.otppractise.R
import com.example.otppractise.ui.theme.PrimaryColor
import com.example.otppractise.ui.theme.ReemKufi

@Composable
fun LoginScreen(){
    BackgroundImage()
    LoginArea()

}

@Composable
fun BackgroundImage(){
    Box{
        Image(painter = painterResource(id = R.drawable.google_icon),
            contentDescription = " ",
            modifier = Modifier.fillMaxWidth()
        )
    }

}

@Composable
fun LoginArea(){
    Box(contentAlignment = Alignment.BottomCenter){
        Column {

            Text(text = "Welcome, back",
            fontSize = 28.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontFamily = ReemKufi
            )

            Button(onClick = {  },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.google_icon),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(26.dp)
                    )
                    
                    Spacer(modifier = Modifier.width(20.dp))
                    
                    Text(text = "Continue with Google",
                    color = PrimaryColor,
                        fontSize = 16.sp
                    )
                }

            }
        }
    }
}

