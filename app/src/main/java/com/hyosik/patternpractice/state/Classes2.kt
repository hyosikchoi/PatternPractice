package com.hyosik.patternpractice.state


class StoppedState : VideoState {
    override fun play(player: VideoPlayer) {
        println("Starting the video.")
        player.setState(PlayingState())
    }

    override fun stop(player: VideoPlayer) {
        println("Video is already stopped.")
    }
}


class PlayingState : VideoState {
    override fun play(player: VideoPlayer) {
        println("Video is already playing.")
    }

    override fun stop(player: VideoPlayer) {
        println("Pausing the video.")
        player.setState(PausedState())
    }
}


class PausedState : VideoState {
    override fun play(player: VideoPlayer) {
        println("Resuming the video.")
        player.setState(PlayingState())
    }

    override fun stop(player: VideoPlayer) {
        println("Stopping the video.")
        player.setState(StoppedState())
    }
}