package com.denofdevelopers.exercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denofdevelopers.exercises.ui.theme.ExercisesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercisesTheme {
                ComposeQuadrantApp()
            }
        }
    }
}
//
//@Composable
//private fun Article(
//    title: String,
//    shortDescription: String,
//    content: String,
//    imagePainter: Painter,
//    modifier: Modifier = Modifier
//) {
//
//    Column (modifier = modifier) {
//        Image(
//            painter = imagePainter,
//            contentDescription = null
//        )
//        Text(
//            text = title,
//            modifier = Modifier.padding(16.dp),
//            fontSize = 24.sp
//        )
//        Text(
//            text = shortDescription,
//            modifier = Modifier.padding(start = 16.dp, end= 16.dp),
//            textAlign = TextAlign.Justify
//        )
//        Spacer(modifier = Modifier.padding(16.dp))
//        Text(
//            text = content,
//            modifier = Modifier.padding(start = 16.dp, end= 16.dp),
//            textAlign = TextAlign.Justify
//        )
//    }
//}

//@Composable
//private fun TaskCompletedScreen(
//    imagePainter: Painter,
//    title: String,
//    subtitle: String,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = imagePainter,
//            contentDescription = null,
//            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
//        )
//        Text(
//            text = title,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier
//                .padding(top = 24.dp, bottom = 8.dp)
//                .align(alignment = Alignment.CenterHorizontally)
//        )
//        Text(
//            text = subtitle,
//            fontSize = 16.sp,
//            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
//        )
//    }
//}

@Composable
private fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(R.string.text_comp_title),
                description = stringResource(R.string.text_comp_desc),
                backgroundColor = Color(0xFFEADDFF),
                Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.image_comp_title),
                description = stringResource(R.string.image_comp_desc),
                backgroundColor = Color(0xFFD0BCFF),
                Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(R.string.row_comp_title),
                description = stringResource(R.string.row_comp_desc),
                backgroundColor = Color(0xFFB69DF8),
                Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.column_comp_title),
                description = stringResource(R.string.column_comp_desc),
                backgroundColor = Color(0xFFF6EDFF),
                Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExercisesTheme {
//        Article(
//            title = stringResource(R.string.title),
//            shortDescription = stringResource(R.string.short_desc),
//            content = stringResource(R.string.desc),
//            imagePainter = painterResource(R.drawable.background)
//        )
//        TaskCompletedScreen(
//            imagePainter = painterResource(R.drawable.ic_task_completed),
//            title = stringResource(R.string.tasks_done),
//            subtitle = stringResource(R.string.nice_job)
//        )
        ComposeQuadrantApp()
    }
}