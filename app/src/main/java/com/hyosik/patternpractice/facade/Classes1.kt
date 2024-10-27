package com.hyosik.patternpractice.facade


// 온도 조절 장치
class Thermostat {
    fun setTemperature(temperature: Int) {
        println("Setting thermostat to $temperature degrees.")
    }
}

// 전등
class Lights {
    fun on() {
        println("Lights are on.")
    }

    fun off() {
        println("Lights are off.")
    }
}

// 커피 머신
class CoffeeMaker {
    fun brewCoffee() {
        println("Brewing coffee.")
    }
}

// 스마트 홈 시스템
// 일어나면 알아서 온도도 적당하게 맞춰지면서 불도 켜지고 커피 머신이 커피를 내리게끔 한다.
// 즉, 파사드 패턴이란 자신들의 책임을 가지고 있는 클래스들의 각각의 동작을 묶어서 처리를 할 수 있는 패턴이다!
class SmartHomeFacade(
    private val thermostat: Thermostat,
    private val lights: Lights,
    private val coffeeMaker: CoffeeMaker
) {
    fun wakeUp() {
        println("Waking up...")
        thermostat.setTemperature(22)
        lights.on()
        coffeeMaker.brewCoffee()
    }

    fun leaveHome() {
        println("Leaving home...")
        thermostat.setTemperature(18)
        lights.off()
    }
}