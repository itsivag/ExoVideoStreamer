package com.itsivag.exovideostreamer

import android.content.Context
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView


class ExoVideoStreamer {
    fun streamVideo(context: Context, playerView: PlayerView, url: String) {
        val simpleExoPlayer = ExoPlayer.Builder(context).build()
        playerView.player = simpleExoPlayer
        val mediaItem: MediaItem =
            MediaItem.fromUri(url)
        simpleExoPlayer.addMediaItem(mediaItem)
        simpleExoPlayer.prepare()
        simpleExoPlayer.playWhenReady = true
    }
}