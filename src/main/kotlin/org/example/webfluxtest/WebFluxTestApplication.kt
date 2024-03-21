package org.example.webfluxtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebFluxTestApplication

fun main(args: Array<String>) {
    runApplication<WebFluxTestApplication>(*args)
}
