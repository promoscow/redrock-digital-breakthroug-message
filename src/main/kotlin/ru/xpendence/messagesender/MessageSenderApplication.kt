package ru.xpendence.messagesender

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@SpringBootApplication
@PropertySources(value = [PropertySource(value = ["classpath:mail.properties"])])
class MessageSenderApplication

fun main(args: Array<String>) {
    runApplication<MessageSenderApplication>(*args)
}
