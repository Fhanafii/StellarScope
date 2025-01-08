package com.fhanafi.stellarscope.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fhanafi.stellarscope.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip

@Composable
fun ProfileComponent(
    welcome: String,
    name: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF3F235B))
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.ic_profile2),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(end = 8.dp)
                .size(48.dp)
                .clip(CircleShape)
        )

        // Text Information
        Column(
            modifier = Modifier.weight(1f)
        ) {
            androidx.compose.material3.Text(
                text = welcome,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp
            )
            androidx.compose.material3.Text(
                text = name,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview(){
    ProfileComponent(
        welcome = "Welcome",
        name = "Fahmi Hanafi"
    )
}
