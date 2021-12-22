package section2.question2

/*
2. Explain the differences between TreeMap, HashMap, and LinkedHashMap.
Provide an example of when each one would be best.
 */
fun main() {
    hashMapDemo()
}

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