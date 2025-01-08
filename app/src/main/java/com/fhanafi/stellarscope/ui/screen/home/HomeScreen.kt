package com.fhanafi.stellarscope.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fhanafi.stellarscope.ui.common.BottomNavigationBar

/*
@Composable
fun HomeScreen() {
    val planets = remember {
        listOf(
            Triple(R.drawable.mars, "Mars", "1,258,250 km"),
            Triple(R.drawable.moon, "Moon", "258,250 km"),
            Triple(R.drawable.sorosh, "Sorosh", "2,608,250 km")
        )
    }
    var selectedTab = 0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF40235E))
    ) {
        // Header
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Welcome", color = Color.White, fontSize = 20.sp, modifier = Modifier.padding(16.dp))
        Text(text = "Audrey", color = Color.Gray, fontSize = 14.sp, modifier = Modifier.padding(start = 16.dp))

        // Search Bar
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(query = "", onQueryChanged = {})

        // List of Planets
        LazyColumn {
            items(planets.size) { index ->
                ListItem(
                    imageRes = planets[index].first,
                    title = planets[index].second,
                    distance = planets[index].third,
                    onClick = {}
                )
            }
        }

        // Bottom Navigation
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar(
            selectedItem = selectedTab,
            onItemSelected = { selectedTab = it }
        )
    }
}
*/
