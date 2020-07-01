package ru.brovkin.microservice.image

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImageServiceApplication

fun main(args: Array<String>) {
	runApplication<ImageServiceApplication>(*args)
}
