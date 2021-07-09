package com.xolidon.summer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SummerApplication

fun main(args: Array<String>) {
    runApplication<SummerApplication>(*args)
}
