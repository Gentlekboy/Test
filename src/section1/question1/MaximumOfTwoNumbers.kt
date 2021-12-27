package section1.question1

import kotlin.math.abs

/*
1. Write a method that finds the maximum of two numbers.
A.You should not use if-else or any other comparison operator. B. Use a comparison operator.
C. Compare time-complexity for A & B above.
 */

//Time complexity of O(1)
fun maximumOfTwoNumbersWithoutComparisonOperators(x: Int, y: Int) {
    //To find the maximum number using a mathematical expression
    val answer = ((x + y) + abs(x - y)) / 2
    println("Without comparison operators --> $answer")
}

//Time complexity of O(1)
fun maximumOfTwoNumbersWithComparisonOperators(x: Int, y: Int) {
    //To find the maximum number using conditional expressions
    if (x > y) {
        println("With comparison operators --> $x")
    } else {
        println("With comparison operators --> $y")
    }
}