package com.hyosik.patternpractice.state

fun main() {
    /**
     * State 패턴은 무언가의 상태를 그 값별로 클래스로 분리해서
     * 상태들 각각이 나름대로의 방식으로 메소드들을 구현하고
     * 필요시 스스로를 다른 상태로 전환하도록 하여 코드의 복잡성을 줄이고 유연성을 높입니다.
     */
    val door = Door(ClosedState())

    door.open()
    door.open()
    door.close()
    door.close()


    val videoPlayer = VideoPlayer(StoppedState())

    videoPlayer.play();   // "Starting the video."
    videoPlayer.play();   // "Video is already playing."
    videoPlayer.stop();   // "Pausing the video."
    videoPlayer.play();   // "Resuming the video."
    videoPlayer.stop();   // "Pausing the video."
    videoPlayer.stop();   // "Stopping the video."
    videoPlayer.stop();   // "Video is already stopped."

}