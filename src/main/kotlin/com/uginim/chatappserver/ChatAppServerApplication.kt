package com.uginim.chatappserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatAppServerApplication

fun main(args: Array<String>) {
    runApplication<ChatAppServerApplication>(*args)
}
