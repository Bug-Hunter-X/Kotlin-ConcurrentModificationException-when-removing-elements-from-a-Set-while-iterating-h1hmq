fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    // Solution 1: Using iterator.remove()
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 3) {
            iterator.remove()
        }
    }
    println("Solution 1: $set") // Output: [1, 2, 3]

    // Solution 2: Create a new set
    val set2 = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set2.filter { it <= 3 }.toMutableSet()
    println("Solution 2: $newSet") // Output: [1, 2, 3]

    // Solution 3: Using filterTo
    val set3 = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = mutableSetOf<Int>()
    set3.filterTo(filteredSet){it <= 3}
    println("Solution 3: $filteredSet") // Output: [1, 2, 3] 
} 