package com.stonewater.koincourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stonewater.koincourse.ui.theme.KoincourseTheme
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

//    private val viewModel by viewModel<MainViewModel>() // injection in case of XML UI Toolkit project

    private val api by inject<DummyApi>() // Lazy injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KoincourseTheme {
                val viewModel = getViewModel<MainViewModel>() // injection in case of Compose UI Toolkit project
                viewModel.doNetworkCall()
            }
        }
    }
}