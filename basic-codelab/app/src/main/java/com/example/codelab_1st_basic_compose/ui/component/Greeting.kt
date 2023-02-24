package com.example.codelab_1st_basic_compose.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codelab_1st_basic_compose.R
import com.example.codelab_1st_basic_compose.ui.theme.BasicComposeTheme

@Composable
fun Greeting(name: String) {
    val expanded = remember {
        mutableStateOf(false)
    }

    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()) {
        Row(modifier = Modifier
            .padding(horizontal = 4.dp)
            .animateContentSize(animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessMedium))) {
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

                AnimatedVisibility(
                    visible = expanded.value,
                    enter = fadeIn(animationSpec = spring(stiffness = Spring.StiffnessHigh)),
                    exit = fadeOut(animationSpec = spring(stiffness = Spring.StiffnessHigh)),
                ) {
                    Text(text = "I'm reading a book called Atomic Habits and it's interesting".repeat(
                        4))
                }
            }

            IconButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = if (expanded.value) 48.dp else 0.dp),
                onClick = {
                    expanded.value = !expanded.value
                },
            ) {
                Icon(imageVector = if (expanded.value) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = if (expanded.value) stringResource(id = R.string.show_less) else stringResource(
                        id = R.string.show_more)
                )
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
