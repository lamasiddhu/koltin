package com.example.computing36a

fun displayList(){
    val numbers :List<String> = listOf("one", "two","three", "four")

println("Numbers of elements : ${numbers.size}")
println("Third elements : ${numbers.get(2)}")
println("Fourth elements : ${numbers[3]}")
println("Index of elements \"two\" ${numbers.indexOf("two")}")
}