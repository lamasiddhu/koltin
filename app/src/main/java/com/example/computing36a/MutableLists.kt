package com.example.computing36a

fun main(){
    //Immutable list
    val lst = listOf("one" , "two" , "three")
    println("Mutable List")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
    //Mutable List
    val mutableLst = mutableListOf("one" , "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for (i in mutableLst.indices){
        println(mutableLst[i])
    }
}