package com.cowriting.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.cocreation.*")
class CoWritingApplication

fun main(args: Array<String>) {
    runApplication<CoWritingApplication>(*args)
}
