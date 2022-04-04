package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//first function
fun first() {
    print("Happy Birthday!\n")
    print("Marcelo\n")
    print("You are 23!")
}

//second function
fun second() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Marcelo!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
//third function
fun third() {

    val age = 23 * 365
    val name = "Marcelo"

    println("Happy Birthday, ${name}!")

    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")

    // This prints an empty line.
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}
//fourth function
fun fourth() {
    val age = 23
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

//those functions are all the ones that were in the codelab
fun main(){
    //first()
    //second()
    //third()
    fourth()
}

