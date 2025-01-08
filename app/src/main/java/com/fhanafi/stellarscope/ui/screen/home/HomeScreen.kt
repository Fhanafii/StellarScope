package com.fhanafi.stellarscope.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhanafi.stellarscope.ui.components.ListPlanet
import com.fhanafi.stellarscope.ui.components.ProfileComponent
import com.fhanafi.stellarscope.ui.components.SearchBar
import com.fhanafi.stellarscope.R

@Composable
fun HomeScreen() {
    var query by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // RoundedRectanglePlaceholder adjusted to cover top area seamlessly
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = androidx.compose.ui.graphics.Color(0xFF40235E),
                        shape = RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                ) {
                    // Profile Section
                    ProfileComponent(
                        welcome = "Welcome back!",
                        name = "Fahmi"
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Search Bar
                    SearchBar(
                        query = query,
                        onQueryChanged = { newQuery ->
                            query = newQuery
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Planet List Section masih bisa pakai lazyColumn sama Local data source. Karna kalo pake api terlalu ribet
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                ListPlanet(
                    imageRes = R.drawable.mars, // Replace with actual planet image resource
                    title = "Mars",
                    distance = "1,258,250 km",
                    onClick = { /* Navigate to Planet Details */ }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}