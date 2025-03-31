package com.example.precisepal.presentation.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.precisepal.presentation.theme.InterFontFamily
import com.example.precisepal.presentation.theme.backgroundLight

@Composable
fun MeasureMateDialog(
    modifier: Modifier = Modifier,
    isOpen: Boolean,
    title: String,
    body: @Composable () -> Unit,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    confirmButtonText: String?,
    dismissButtonText: String?,
) {
    if (isOpen) {
        AlertDialog(
            containerColor = Color.White,
            titleContentColor = Color.Black,
            textContentColor = Color.Black,
            modifier = modifier,
            title = {
                Text(
                    text = title,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = InterFontFamily
                )
            },
            text = body,
            onDismissRequest = { onDismiss() },
            confirmButton = {
                if (confirmButtonText != null) {
                    TextButton(onClick = { onConfirm() }) {
                        Text(text = confirmButtonText, color = Color.Black)
                    }
                }
            },
            dismissButton = {
                if (dismissButtonText != null) {
                    TextButton(onClick = { onDismiss() }) {
                        Text(text = dismissButtonText, color = Color.Black)
                    }
                }
            },
        )
    }
}

@Preview
@Composable
private fun MatesDialogPreview() {
    MeasureMateDialog(
        isOpen = true,
        onDismiss = {},
        onConfirm = {},
        title = "welcome back",
        body = { Text("Yah my boy") },
        confirmButtonText = "yeah",
        dismissButtonText = "nah"
    )

}