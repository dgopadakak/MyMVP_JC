package com.example.mymvpjc.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
            MyMVPJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        appComponent.inject(this)
        presenter.attachView(this)
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
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    MyMVPJCTheme {
//        Surface (
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.background
//        ) {
//            Greeting(
//                name = "Android",
//                modifier = Modifier.padding(32.dp)
//            )
//        }
//    }
//
//    Box(modifier = Modifier
//        .background(Color.Red)
//        .size(200.dp)
//        .padding(32.dp)
//        .background(Color.Green)
//        .padding(32.dp)
//        .background(Color.Blue)
//    )
//

}
