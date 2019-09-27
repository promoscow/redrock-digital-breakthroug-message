package ru.xpendence.messagesender.service.mock

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import ru.xpendence.messagesender.dto.EmailMessageDto
import ru.xpendence.messagesender.dto.ResponseDto
import ru.xpendence.messagesender.service.EmailService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 21.07.19
 * Time: 15:27
 * e-mail: v.chernyshov@pflb.ru
 */
@Profile(value = ["h2-mock"])
@Service
class EmailServiceMockImpl : EmailService {

    override fun send(dto: EmailMessageDto): ResponseDto {
        return ResponseDto(true)
    }
}
