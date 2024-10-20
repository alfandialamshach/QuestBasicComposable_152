
package com.example.project2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DataDiri(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .background(color = Color(0xFF00A3E0))
    )
    {
        Text("Login", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Ini adalah halaman login", fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).size(200.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Nama", fontSize = 50.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Alfandi Alamshach", fontSize = 40.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("20220140152", fontSize = 50.sp, color = Color.Red)

        Image(
            painter = painterResource(id = R.drawable.gunung),
            contentDescription = "",
            modifier = Modifier.clip(RectangleShape).size(400.dp)

        )
    }

}
