
object Robot {

    val rgt= "right"
    val lft = "left"
    val fwd = "forward"
    val bck = "backward"
    private var msg = ""
    private var count = 0

    infix fun move(direction: Int): Unit{
        when(direction){
            1 -> msg = "The robot is moving $fwd."
            2 -> msg = "The robot is moving $bck."
            3 -> msg = "The robot is moving $rgt."
            4 -> msg = "The robot is moving $lft."
        }
        count += 1
        print(" >>>>>> ${msg}")
    }

    infix fun coveredDist(m: Int) {
        if(count == m )
            println( "\n::::::: The robot has covered $count meters up to now! :::::::")
        else
            println( "\n::::::: The robot has covered $m meters up to now! :::::::")
    }
}
