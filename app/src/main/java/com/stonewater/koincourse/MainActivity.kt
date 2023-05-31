package com.stonewater.koincourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stonewater.koincourse.ui.theme.KoincourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KoincourseTheme {
                val viewModel = MainViewModel(MainRepositoryImpl())
                viewModel.doNetworkCall()
            }
        }
    }
}