package com.fhanafi.stellarscope.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhanafi.stellarscope.ui.navigation.NavigationItem
import com.fhanafi.stellarscope.ui.navigation.Screen
import com.fhanafi.stellarscope.R
import com.fhanafi.stellarscope.ui.theme.*

@Composable
fun BottomNavigationBar(
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    val navigationItems = listOf(
        NavigationItem(
            icon = R.drawable.ic_home,
            screen = Screen.Home
        ),
        NavigationItem(
            icon = R.drawable.ic_bookmark,
            screen = Screen.Favorite
        ),
        NavigationItem(
            icon = R.drawable.ic_user,
            screen = Screen.Profile
        )
    )
    //TODO : Ngebuat bottom nav bisa ada selected state. kemungkinan itu dari luar row bukan di dalam row
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF120E1E))
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        navigationItems.forEachIndexed { index, item ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .clickable { onItemSelected(index) }
            ) {
                /*if (selectedItem == index) {
                    // Use rectangle.png as the indicator with the correct color
                    Icon(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = null,
                        tint = Color(0xFF9C27B0), // Use the desired purple tint
                        modifier = Modifier.size(5.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                } else {
                    Spacer(modifier = Modifier.height(12.dp)) // Align unselected icons
                }*/

                Icon(
                    painter = painterResource(id = item.icon),
                    contentDescription = item.screen.route,
                    tint = Coloricon,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavPreview(){
    BottomNavigationBar(
        selectedItem = 0,
        onItemSelected = {}
    )

}