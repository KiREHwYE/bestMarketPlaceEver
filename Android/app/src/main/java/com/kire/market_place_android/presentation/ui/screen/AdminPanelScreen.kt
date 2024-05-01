package com.kire.market_place_android.presentation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kire.market_place_android.presentation.navigation.Transition.AdminPanelScreenTransitions
import com.kire.market_place_android.presentation.ui.admin_panel_screen_ui.AdminPanelEntrancePaneUnit
import com.kire.market_place_android.presentation.ui.screen.destinations.AdminPanelItemsScreenDestination
import com.kire.test.R
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(style = AdminPanelScreenTransitions::class)
@Composable
fun AdminPanelScreen(
    navigator: DestinationsNavigator,
    paddingValues: PaddingValues = PaddingValues(start = 28.dp, end = 28.dp, bottom = 66.dp)
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(paddingValues),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.choose_menu),
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(15.dp))

        AdminPanelEntrancePaneUnit(
            textValue = stringResource(id = R.string.items),
            onClick = { navigator.navigate(AdminPanelItemsScreenDestination) }
        )

        AdminPanelEntrancePaneUnit(
            textValue = stringResource(id = R.string.pick_up_points),
            onClick = { /* TODO */ }
        )

        AdminPanelEntrancePaneUnit(
            textValue = stringResource(id = R.string.users),
            onClick = { /* TODO */ }
        )
    }
}