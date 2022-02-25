class Student {
    var name: String = ""
    var surname: String = ""
    var passing: Boolean = false
    var averageGrade: Double = 0.0

    fun setName(n: String): String {
        name = n
        return name
    }

    fun setSurname(sn: String): String {
        surname = sn
        return surname
    }

    fun setStatus(p: Boolean): Boolean {
        passing = p
        return passing
    }

    fun setAveg(average: Double): Double {
        averageGrade = average
        return averageGrade
    }
}
