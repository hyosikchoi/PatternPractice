package com.hyosik.patternpractice.state

class WithoutStateVideoPlayer(
    private var state: String
) {
    /** state 패턴을 사용 하지 않으면 if else 문을 저렇게 많이 사용해야한다... */
    fun play() {
        if (state.equals("Stopped")) {
            System.out.println("Starting the video.");
            state = "Playing";
        } else if (state.equals("Playing")) {
            System.out.println("Video is already playing.");
        } else if (state.equals("Paused")) {
            System.out.println("Resuming the video.");
            state = "Playing";
        }
    }

    fun stop() {
        if (state.equals("Playing")) {
            System.out.println("Pausing the video.");
            state = "Paused";
        } else if (state.equals("Paused")) {
            System.out.println("Stopping the video.");
            state = "Stopped";
        } else if (state.equals("Stopped")) {
            System.out.println("Video is already stopped.");
        }
    }

}

