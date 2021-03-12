/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Puppy adoption app")
                            }
                        )
                    }
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "list") {
                        composable(
                            route = "list",
                        ) {
                            PuppyList(
                                onClick = {
                                    navController.navigate("detail/$it")
                                }
                            )
                        }
                        composable(
                            route = "detail/{index}",
                            arguments = listOf(
                                navArgument("index") {
                                    type = NavType.StringType
                                }
                            )
                        ) { backStackEntry ->
                            val index = backStackEntry
                                .arguments?.getString("index")
                                ?.toInt() ?: throw IllegalArgumentException()
                            PuppyDetail(
                                index
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PuppyList(onClick: (Int) -> Unit) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(puppies.size) { index ->
            Card(
                modifier = Modifier
                    .clickable { onClick(index) }
                    .padding(4.dp)
                    .fillMaxWidth(),
                elevation = 4.dp
            ) {
                val p = puppies[index]
                Row {
                    Text(
                        modifier = Modifier
                            .padding(4.dp)
                            .size(30.dp),
                        text = p.image,
                        style = TextStyle(fontSize = 24.sp)
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Text(
                        modifier = Modifier,
                        text = p.name,
                        style = MaterialTheme.typography.h4
                    )
                }
            }
            Spacer(modifier = Modifier.size(4.dp))
        }
    }
}

@Composable
private fun PuppyDetail(index: Int) {
    val puppy = puppies[index]
    Column(
        Modifier
            .padding(8.dp)
            .background(color = MaterialTheme.colors.surface)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = puppy.image,
            style = TextStyle(fontSize = 80.sp)
        )
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = "name: ${puppy.name}",
            style = MaterialTheme.typography.h6
        )
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = "age: ${puppy.age}",
            style = MaterialTheme.typography.h6
        )
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = "sex: ${puppy.sex}",
            style = MaterialTheme.typography.h6
        )
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = puppy.description,
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewList() {
    MyTheme {
        PuppyList {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDetail() {
    MyTheme {
        PuppyDetail(index = 0)
    }
}
