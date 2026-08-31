package com.example.project30.presentation.homecommen.collectinpack

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.net.toUri
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.project30.R


@Composable
fun BrandVideo() {
    
    val context = LocalContext.current
    
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            
            val uri = "android.resource://${context.packageName}/${R.raw.video}".toUri()
            
            setMediaItem(MediaItem.fromUri(uri))
            prepare()
            
            playWhenReady = true
            repeatMode = Player.REPEAT_MODE_ONE
        }
    }
    
    AndroidView(
            factory = {
                PlayerView(context).apply {
                    player = exoPlayer
                    useController = false
                    setOnTouchListener { _, _ -> true }
                }
            },
            modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
    )
    
    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }
}