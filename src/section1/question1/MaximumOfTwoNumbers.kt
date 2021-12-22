package section1.question1

import kotlin.math.abs

/*
1. Write a method that finds the maximum of two numbers.
A.You should not use if-else or any other comparison operator. B. Use a comparison operator.
C. Compare time-complexity for A & B above.
 */

fun maximumOfTwoNumbersWithoutComparisonOperators(x: Int, y: Int): Int {
    //To find the maximum number using a mathematical expression
    return ((x + y) + abs(x - y)) / 2
}

fun maximumOfTwoNumbersWithComparisonOperators(x: Int, y: Int): Int {
    //To find the maximum number using conditional expressions
    return if (x > y) x else y
}