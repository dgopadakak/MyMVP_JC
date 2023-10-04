package com.example.mymvpjc.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

    override fun makeToast(text: String) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}

@Composable
fun ThisScreen() {
    MyMVPJCTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .fillMaxSize()
        ) {

        }
    }
}

@Preview (showBackground = true)
@Composable
fun ThisScreenPreview() {
    ThisScreen()
}
