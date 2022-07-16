package damin.tothemoon.booklink.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
  primary = Blue200,
  primaryVariant = Blue100,
)

@Composable
fun BookLinkTheme(content: @Composable () -> Unit) {
  MaterialTheme(
    colors = LightColorPalette,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}