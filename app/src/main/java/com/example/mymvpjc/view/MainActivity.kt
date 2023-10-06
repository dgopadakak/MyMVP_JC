package com.example.mymvpjc.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymvpjc.R
import com.example.mymvpjc.appComponent
import com.example.mymvpjc.presenter.Presenter
import com.example.mymvpjc.ui.theme.MyMVPJCTheme
import javax.inject.Inject

class MainActivity : ComponentActivity(), Viewable {
    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThisScreen()
        }

        appComponent.inject(this)
        //presenter.attachView(this)
    }

    override fun showTime(time: String) {
        TODO("Not yet implemented")
    }

    override fun showLedStatus(status: Boolean) {
        TODO("Not yet implemented")
    }

    override fun changeConnectionStatus(statusNum: Int) {
        TODO("Not yet implemented")
    }

    override fun changeSwitchEnabled(status: Boolean) {
        TODO("Not yet implemented")
    }

    override fun makeToast(publishDone: Boolean) {
        val text = if (publishDone) getString(R.string.publish_done)
        else getString(R.string.publish_error)
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThisScreen() {
    MyMVPJCTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary
                    ),
                    title = { Text(text = "ESP8266 + MQTT") }
                )
            }
        ) { innerPadding ->
            Surface(
                color = MaterialTheme.colorScheme.background,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {

            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun ThisScreenPreview() {
    ThisScreen()
}
