package com.fhanafi.stellarscope.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fhanafi.stellarscope.R
import com.fhanafi.stellarscope.ui.theme.Coloricon

@Composable
fun SearchBar(
    query: String,
    onQueryChanged: (String) -> Unit
) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChanged,
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = null,
                tint = Coloricon,
                modifier = Modifier.size(24.dp)
            )
        },
        placeholder = {
            Text(
                text = "Find your planet",
                style = TextStyle(color = Color.Gray, fontSize = 16.sp)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(32.dp)),
        singleLine = true
    )
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview(){
    SearchBar(
        query = "",
        onQueryChanged = {}
    )
}