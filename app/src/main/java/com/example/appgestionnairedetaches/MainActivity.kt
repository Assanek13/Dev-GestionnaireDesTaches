package com.example.appgestionnairedetaches

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appgestionnairedetaches.ui.theme.AppGestionnaireDeTachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppGestionnaireDeTachesTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Myapp()
                }
            }
        }
    }
}

@Composable
fun Myapp(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),


        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter= painterResource(id=R.drawable.ic_task_completed),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 300.dp)


        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(text="All tasks completed")
        Text(text="Nice work!")

    }

}

@Preview(showBackground = true)
@Composable
fun MyappPreview() {
    AppGestionnaireDeTachesTheme {
        Myapp()
    }
}