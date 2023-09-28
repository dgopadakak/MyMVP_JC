package com.example.mymvpjc.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        modifier = modifier,
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
//                modifier = Modifier
//                    .padding(32.dp)
//                    //.background(color = Color.Green, shape = CircleShape)
//            )
//        }
//    }
//
//    MyMVPJCTheme {
//        Greeting(
//            name = "Android",
//            modifier = Modifier.padding(32.dp)
//                .fillMaxSize()
//                .background(color = Color.Green, shape = CircleShape)
//        )
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
//    MyMVPJCTheme {
////        Surface (
////            modifier = Modifier.fillMaxSize(),
////            color = MaterialTheme.colorScheme.background
////        ) {
////            Text(text = "aaaa", modifier = Modifier.padding(20.dp).background(Color.Blue))
////            Text(text = "bbbb", modifier = Modifier.padding(150.dp).background(Color.Red))
////        }
//
//        Box (
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Text(text = "aaaa", modifier = Modifier.padding(20.dp).background(Color.Blue))
//            Text(text = "bbbb", modifier = Modifier.padding(150.dp).background(Color.Red))
//        }
//    }
//
//    MyMVPJCTheme {
//        Surface(    // Растягивает первого потомка до собственных размеров
//            modifier = Modifier
//                .size(200.dp)
//        ) {
//            Column(
//                modifier = Modifier
//                    .size(50.dp)    // Это будет проигнорировано
//                    .background(Color.Red, RoundedCornerShape(8.dp))
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(50.dp)
//                        .background(Color.Green, RoundedCornerShape(8.dp))
//                )
//            }
//        }
//    }
//

}
