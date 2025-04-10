package com.example.precisepal.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.precisepal.domain.model.User
import com.example.precisepal.presentation.theme.InterFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileBottomSheet(
    onDismiss: () -> Unit,
    userInstance: User?,
    isOpen: Boolean,
    sheetState: SheetState,
    buttonPrimaryText: String,
    buttonLoadingState: Boolean,
    onButtonClick: () -> Unit,
) {
    if (isOpen) {
        ModalBottomSheet(
            onDismissRequest = { onDismiss() },
            sheetState = sheetState,
            containerColor = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp, top = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ProfilePicPlaceholder(
                    profilePicUrl = if (userInstance == null || userInstance.isAnonymous) null else userInstance.profilePic,
                    placeHolderSize = 120.dp,
                    boarderWidth = 0.6.dp
                )
                Text(
                    text = if (userInstance == null || userInstance.isAnonymous) "Anonymous" else userInstance.name,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
                Text(
                    text = if (userInstance == null || userInstance.isAnonymous) "anonymous@BookMile.io" else userInstance.email,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(24.dp))
                GoogleSignInButton(
                    onButtonClick = { onButtonClick() },
                    loadingState = buttonLoadingState,
                    primaryText = buttonPrimaryText,
                    enableUI = true
                )
            }
        }
    }
}