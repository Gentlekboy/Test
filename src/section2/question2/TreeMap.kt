package section2.question2

import java.util.*

fun main() {
    treeMapDemo()
}

/*
TreeMap has complexity of O(logN) for insertion and lookup.
TreeMap does not allow null key but allow multiple null values.
TreeMap maintains order. It stores keys in sorted and ascending order.
 */

fun treeMapDemo(){
    val treeMap = TreeMap<String?, String?>()

    //Print keys by ascending order
    treeMap.put("One", "1")
    treeMap.put("Five", null)
    treeMap.put("Four", "4")
    treeMap.put("Two", "2")
    treeMap.put("Three", null)
    println("$treeMap")

    //This should throw a Null Pointer Exception
    treeMap.put(null, "2")
    treeMap.put(null, null)
    println("$treeMap")
}