package section2.question2

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

/*
2. Explain the differences between TreeMap, HashMap, and LinkedHashMap.
Provide an example of when each one would be best.
 */

/*
HashMap has complexity of O(1) for insertion and lookup.
HashMap allows one null key and multiple null values.
HashMap does not maintain any order.
 */

fun hashMapDemo(){
    val hashMap = HashMap<String?, String?>()

    //Print randomly
    hashMap.put("One", "1")
    hashMap.put("Five", "5")
    hashMap.put("Four", "4")
    hashMap.put("Two", "2")
    hashMap.put("Three", "3")
    println("$hashMap")

    //Takes just one null key but multiple null values
    hashMap.put(null, "2")
    hashMap.put("Six", null)
    hashMap.put(null, null)
    println("$hashMap")
}

/*
LinkedHashMap has complexity of O(1) for insertion and lookup.
LinkedHashMap allows one null key and multiple null values.
LinkedHashMap maintains order in which key-value pairs are inserted.
 */

fun linkedHashMapDemo(){
    val linkedHashMap = LinkedHashMap<String?, String?>()

    //Print as added/inserted
    linkedHashMap.put("One", "1")
    linkedHashMap.put("Five", "5")
    linkedHashMap.put("Four", "4")
    linkedHashMap.put("Two", "2")
    linkedHashMap.put("Three", "3")
    println("$linkedHashMap")

    //Takes just one null key but multiple null values
    linkedHashMap.put(null, "2")
    linkedHashMap.put("Six", null)
    linkedHashMap.put(null, null)
    println("$linkedHashMap")
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