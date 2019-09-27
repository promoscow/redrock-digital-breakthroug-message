package ru.xpendence.messagesender.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.messagesender.dto.EmailMessageDto
import ru.xpendence.messagesender.dto.ResponseDto
import ru.xpendence.messagesender.service.EmailService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.07.19
 * Time: 15:53
 * e-mail: v.chernyshov@pflb.ru
 */
@RestController
@RequestMapping("/email")
class EmailController {

    @Autowired
    lateinit var service: EmailService

    @PostMapping
    fun send(@RequestBody dto: EmailMessageDto): ResponseEntity<ResponseDto> {
        println("received dto to send: $dto")
        return ResponseEntity.ok(service.send(dto))
    }
}
