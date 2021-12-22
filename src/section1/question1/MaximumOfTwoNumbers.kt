package section1.question1

import kotlin.math.abs

fun maximumOfTwoNumbersWithoutComparisonOperators(x: Int, y: Int): Int {
    //To find the maximum number using a mathematical expression
    return ((x + y) + abs(x - y)) / 2
}

fun maximumOfTwoNumbersWithComparisonOperators(x: Int, y: Int): Int {
    //To find the maximum number using conditional expressions
    return if (x > y) x else y
}