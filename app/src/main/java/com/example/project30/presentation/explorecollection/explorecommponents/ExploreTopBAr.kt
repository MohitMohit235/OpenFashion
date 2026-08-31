package com.example.project30.presentation.homecommen.homepack.hometopbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project30.R
import com.example.project30.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreTopBar(
        onClickMenu: () -> Unit,
        Backcolor: Color,
        Iconscolor: Color,
        navController: NavController
) {
    val font = FontFamily(Font(R.font.ivy))
    
    TopAppBar(
            
            colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Backcolor,
                    actionIconContentColor = Color.White
            ),
            
            navigationIcon = {
                Box(
                        modifier = Modifier
                                .padding(start = 16.dp)
                                .fillMaxWidth(fraction = 0.3f)
                ) {
                    IconButton(
                            onClick = { onClickMenu() }
                    ) {
                        Icon(
                                painter = painterResource(R.drawable.backward),
                                contentDescription = null,
                                tint = Iconscolor
                        )
                    }
                }
            },
            
            title = {
                Box(
                        modifier = Modifier.height(60.dp)
                ) {
                    Icon(
                            painter = painterResource(R.drawable.logo),
                            contentDescription = null,
                            tint = Iconscolor,
                            modifier = Modifier.size(110.dp)
                    )
                }
            },
            
            actions = {
                Row(
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    
                    IconButton(
                            colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Backcolor
                            ),
                            onClick = {
                                navController.navigate(route = Screen.SearchScree.route){
                                    popUpTo(Screen.MainScree.route){inclusive=true}
                                }
                            }
                    ) {
                        Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = null,
                                tint = Iconscolor
                        )
                    }
                    
                    
                    IconButton(
                            colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Backcolor
                            ),
                            onClick = {
                                navController.navigate(Screen.CartScree.route){
                                    popUpTo(Screen.MainScree.route){inclusive= true}
                                }
                            }
                    ) {
                        Icon(
                                painter = painterResource(R.drawable.shoppingbag),
                                contentDescription = null,
                                tint = Iconscolor
                        )
                    }
                }
            }
    )
}