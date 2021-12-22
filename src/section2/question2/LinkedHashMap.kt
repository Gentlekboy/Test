package section2.question2

fun main() {
    linkedHashMapDemo()
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