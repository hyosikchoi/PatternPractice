package com.hyosik.patternpractice.state

class VideoPlayer(
    private var state: VideoState
) {

    fun setState(state: VideoState) {
        this.state = state
    }

    fun play() {
        state.play(this)
    }

    fun stop() {
        state.stop(this)
    }

}