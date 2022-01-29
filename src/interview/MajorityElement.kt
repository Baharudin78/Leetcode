package interview
/*
Problem Description

Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2.
 */
fun main() {
    var input = intArrayOf(2, 4, 5, 2, 2)
    print(majorityElement(input))
}
fun majorityElement(array: IntArray)  {
    for (i in 0 until array.size) {
        if (array[i] == i ) {
            print(i)
        }
    }
}
