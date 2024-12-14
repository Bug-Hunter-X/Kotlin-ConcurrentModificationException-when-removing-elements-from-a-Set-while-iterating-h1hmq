fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value > 1 }
    println(map) // Output: {a=1}

    //The problem is in the following code, the iterator is modified while iterating
    val set = mutableSetOf(1,2,3,4,5)
    val iterator = set.iterator()
    while (iterator.hasNext()){
        val element = iterator.next()
        if (element > 3){
            set.remove(element) // ConcurrentModificationException
        }
    }
    println(set) 
}