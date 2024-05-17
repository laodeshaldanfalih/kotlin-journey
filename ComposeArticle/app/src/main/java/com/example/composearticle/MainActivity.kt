package com.example.composearticle

import android.media.Image
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        title = stringResource(R.string.title),
                        header = stringResource(R.string.header),
                        body = stringResource(R.string.body)

                    )
                }
            }
        }
    }
}

@Composable
fun Article(title: String, header: String, body: String, modifier: Modifier = Modifier) {
    val title = title
    val header = header
    val body = body
    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
        )
        Column(
            verticalArrangement = Arrangement.Top, // Set vertical arrangement
            modifier = Modifier.padding(horizontal = 15.dp)
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(
                    all = 16.dp
                )

            )
            Text(
                text = header,
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = body,
                modifier = Modifier.padding(
                    all = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {

    }
}