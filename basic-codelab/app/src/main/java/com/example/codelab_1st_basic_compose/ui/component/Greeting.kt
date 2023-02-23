package com.example.codelab_1st_basic_compose.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codelab_1st_basic_compose.ui.theme.BasicComposeTheme

@Composable
fun Greeting(name: String) {
    val expanded = remember {
        mutableStateOf(false)
    }

    val expandedPadding = animateDpAsState(
        targetValue = if (expanded.value) 48.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        )
    )

    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()) {
        Row(modifier = Modifier.padding(horizontal = 4.dp)) {
            Column(
                modifier = Modifier
                    .weight(1f),
            ) {
                Text(text = "Hello!")
                Text(
                    text = name,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            ElevatedButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = expandedPadding.value.coerceAtLeast(0.dp)),
                onClick = {
                    expanded.value = !expanded.value
                }
            ) {
                Text(if (expanded.value) "Show Less" else "Show More")
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "Greet Dark"
)
@Composable
fun GreetingPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }
}
