package com.example.translateapp

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.translateapp.ui.theme.TranslateAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TranslateAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomNavigationBar() }) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    BottomNavigation(
        contentColor = MaterialTheme.colorScheme.primary

    ) {
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    ImageVector.vectorResource(id = R.drawable.ic_chat),
                    contentDescription = "Chat",
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.ic_chat_label),
                    fontSize = 12.sp
                )
            },
            modifier = Modifier.padding(vertical = 21.dp)
        )
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    ImageVector.vectorResource(id = R.drawable.ic_camera),
                    contentDescription = "Camera",
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.ic_camera_label),
                    fontSize = 12.sp
                )
            },
            modifier = Modifier.padding(vertical = 21.dp)
        )
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Box(
                    modifier = Modifier
                        /*.background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                   colorResource(id = R.color.light_blue),  colorResource(id = R.color.app_blue)
                                ),
                                start = Offset(0f, 0f),
                                end = Offset(200f, 200f)
                            ), shape = CircleShape
                        )*/
                        .size(49.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(bitmap = ImageBitmap.imageResource(id = R.drawable.bg), contentDescription = null,
                        modifier = Modifier.size(49.dp))
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_translate),
                        contentDescription = "Translate",
                        modifier = Modifier.padding(8.dp)
                    )
                }

            },
            modifier = Modifier.padding(vertical = 21.dp)
        )
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    ImageVector.vectorResource(id = R.drawable.ic_history),
                    contentDescription = "History",
                    modifier = Modifier.padding(8.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.ic_history_label),
                    fontSize = 12.sp
                )
            },
            modifier = Modifier.padding(vertical = 21.dp)
        )
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    ImageVector.vectorResource(id = R.drawable.ic_fav),
                    contentDescription = "Favorite",
                    modifier = Modifier.padding(8.dp)
                )
            },
            label = {
                Text(
                    text = stringResource(id = R.string.ic_favorite_label),
                    fontSize = 12.sp
                )
            },
            modifier = Modifier.padding(vertical = 21.dp)
        )

    }
}
