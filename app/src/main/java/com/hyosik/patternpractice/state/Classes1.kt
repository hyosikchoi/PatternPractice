package com.hyosik.patternpractice.state

class ClosedState : State {
    override fun open(door: Door) {
        println("Door is now Open.")
        door.setState(OpenState())
    }

    override fun close(door: Door) {
        println("Door is already Closed.")
    }
}


class OpenState : State {
    override fun open(door: Door) {
        println("Door is already Open.")
    }

    override fun close(door: Door) {
        println("Door is now Closed.")
        door.setState(ClosedState())
    }
}