package com.hyosik.patternpractice.facade

fun main() {
    // Facade 는 어떤 건물의 외벽을 의미하는 프랑스어다.
    // 드라이브 스루를 통해 소비자가 물건을 건내받는것과 비슷하다.
    // 창구를 통해 소비자는 원하는 물건을 받지만 창구 안에서 여러가지의 기계들과 사람이 움직이면서 조리하는 과정은 모른다.
    // 파사드 패턴이란 자신들의 책임을 가지고 있는 클래스들의 각각의 동작을 묶어서 처리를 할 수 있는 패턴이다!
    // 예제1
    val thermostat = Thermostat()
    val lights = Lights()
    val coffeeMaker = CoffeeMaker()
    val smartHome = SmartHomeFacade(thermostat, lights, coffeeMaker)
    smartHome.wakeUp()
    smartHome.leaveHome()

    // 예제2
    // read, write, delete 의 객체를 클라이언트가 직접 생성할 필요없이 각각의 책임을 묶어서 가지고 있는
    // facade 객체만 생성해서 기능을 수행할 수 있게한다!
    val fs = FileSystemFacade()

    // Write to file
    val writeSuccess = fs.writeFile(
        "test.txt", "Hello, Facade Pattern!"
    )
    println("File write success: $writeSuccess")

    // Read from file
    val content = fs.readFile("test.txt")
    println("File content: $content")

    // Delete file
    val deleteSuccess = fs.deleteFile("test.txt")
    println(
        "File delete success: $deleteSuccess"
    )

}