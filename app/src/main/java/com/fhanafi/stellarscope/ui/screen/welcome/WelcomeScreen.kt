package com.fhanafi.stellarscope.ui.screen.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhanafi.stellarscope.R
import com.fhanafi.stellarscope.ui.common.BackgroundImage
import com.fhanafi.stellarscope.ui.theme.StellarScopeTheme


@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onTapToLaunch: () -> Unit = {}
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        BackgroundImage()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(0.05f))

            // Title section
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_title),
                    style = MaterialTheme.typography.headlineMedium
                        .copy(fontFamily = FontFamily(Font(R.font.space_groteskbold))),
                    color = Color.White
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.White)) {
                            append(stringResource(R.string.stellar))
                        }
                        withStyle(style = SpanStyle(color = Color(0xFF40235C))) {
                            append(stringResource(R.string.scope))
                        }
                    },
                    style = MaterialTheme.typography.headlineLarge
                        .copy(
                            fontFamily = FontFamily(Font(R.font.space_groteskbold)),
                            fontWeight = FontWeight.Bold
                        )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(R.string.subtitle),
                    style = MaterialTheme.typography.bodyLarge
                        .copy(fontFamily = FontFamily(Font(R.font.space_grotesklight))),
                    color = Color.White.copy(alpha = 0.7f)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Button
            Button(
                onClick = onTapToLaunch,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF40235E)),
                modifier = Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
                    .padding(horizontal = 0.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.tap_to_launch),
                    style = MaterialTheme.typography.labelLarge
                        .copy(fontFamily = FontFamily(Font(R.font.space_groteskmedium))),
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(72.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen (){
    StellarScopeTheme{
        WelcomeScreen()
    }
}