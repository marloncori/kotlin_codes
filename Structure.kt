class Structure {

    infix fun createShape(rows: Int) {
        var k = 0
        for (x in 1 until rows) {
            k = 0
            for(space in 1 until rows-x) {
                print( "  ")
            }
            while (k != 2*x-1) {
                print("* ")
                ++k
            }
            println()
        }

    }
}
