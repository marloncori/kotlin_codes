
fun valueMatch(word: Any): Any {
    val value = when(word){
        is String -> println("\033[1;331\n\t The length of ${word} is ${word.length}.\033[0m")
        in 12..19 -> println("\\033[1;33m\n\t >> The value ${word} is between 12 and 19!\033[0m")
        7 -> println("\033[1;34m\n\t >>> That is considered the number of perfection.\033[0m")
        is Float -> println("\033[1;35m\n\t >>>> You have typed $word, which is a float number.\033[0m")
        else -> println("\033[1;36m\n\t > I do not know what to say about it the value: ${word}.\033[0m")
    }
    return value
}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val v1 = valueMatch("Marlon")
    val v2 = valueMatch(30)
    val v3 = valueMatch(15)
    val v4 = valueMatch(5.7f)
    val v5 = valueMatch(7)

    val list = listOf(v1, v2, v3, v4, v5)

    for (i in list.indices) {
        println("\033[1;32m\t ::::: ${i+1} --> ${list[i]} ::::: \033[0m")
    }

    val l1 = Lamp()
    l1.turnOn()
    l1.displayStatus("l1")

    val l2 = Lamp()
    l2.turnOff()
    l2.displayStatus("l2")

    val kotlin = "I LIKE TO CODE IN KOTLIN!\n"
    var counter = 0
    println(kotlin)

    Robot move 1
    counter += 1

    Robot move 3
    counter += 1

    Robot move 4
    counter += 1
    Robot coveredDist counter

    Robot move 2
    counter += 1

    Robot move 4
    counter += 1

    Robot move 1
    counter += 1

    Robot coveredDist counter

    val pyramid = Structure()
    pyramid createShape 27

    val s1 = Student()
    println(s1.setName("Marlon"))
    println(s1.setSurname(" Couto Ribeiro,"))
    println(s1.setStatus(true))
    println(" average grade: ${s1.setAveg(8.9)}")

    val s2 = Student()
    println(s2.setName("Lazaro"))
    println(s2.setSurname(" de Jesus Ribeiro, "))
    println(s2.setStatus(true))

    val s3 = Student()
    println(s3.setName("Laura"))
    println(s3.setSurname(" Couto Baiana, "))
    println(s3.setStatus(true))

    val s4 = Student()
    println(s4.setName("Geysa"))
    println(s4.setSurname(" Couto von Kriiger, "))
    println(s4.setStatus(true))

    var students = listOf(s1, s2, s3, s4)

    students.filter { it.passing && it.averageGrade > 4.0 } // 1
            .sortedBy { it.averageGrade } // 2
            .take(3) // 3
            .sortedWith(compareBy({ it.surname }, { it.name })) // 4
}
