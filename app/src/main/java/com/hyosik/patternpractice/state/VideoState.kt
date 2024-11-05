package com.hyosik.patternpractice.state

interface VideoState {

    fun play(player: VideoPlayer)

    fun stop(player: VideoPlayer)

}