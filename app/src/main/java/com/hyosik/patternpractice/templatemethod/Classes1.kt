package com.hyosik.patternpractice.templatemethod


// 각각의 Beverage 를 상속받은 Tea, Coffee의 제조 순서 템플릿은 같다.
// 하지만 추상 메서드로 정의된 구현체가 다르다.
// 이렇게 어떠한 템플릿은 동일하되 세부 구현이 다를 경우 사용할 수 있다.
// 구현체가 필요하므로 인터페이스는 안됀다! 추상 클래스로 해야한다.
internal class Tea : Beverage() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding lemon")
    }
}


internal class Coffee : Beverage() {
    override fun brew() {
        println("Dripping coffee through filter")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }
}