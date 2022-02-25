object Algorithm {

    fun <T : Comparable<T>> List<T>.quickSort(): List<T> =
        if(size < 2) this
        else {
            val pivot = first()
            val (smaller, greater) = drop(1).partition { it <= pivot}
            smaller.quickSort() + pivot + greater.quickSort()
        }

    // Usage
    //listOf(2,5,1).quickSort() // [1,2,5]

    fun <T> Collection<T>.powerSet(): Set<Set<T>> =  if (isEmpty()) setOf(emptySet())
                                    else drop(1)
                                          .powerset()
                                            .let {
                                                it + it.map { it + first() }}

    fun <T> powerSetAgain(set: Set<T>): Set<Set<T>> = if (set.isEmpty()) setOf(emptySet())
                                          else powerset(set.drop(1))
                                                        .let { it + it.map { it + set.first() } }

}
