package com.hyosik.patternpractice.state

data class Door(
    private var state: State
) {

    fun setState(state: State) {
        this.state = state
    }

    fun open() {
        state.open(this)
    }

    fun close() {
        state.close(this)
    }

}
