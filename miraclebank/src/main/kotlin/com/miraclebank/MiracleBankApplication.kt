package com.miraclebank

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MiracleBankApplication

fun main(args: Array<String>) {

    SpringApplication.run(MiracleBankApplication::class.java, *args)
}
