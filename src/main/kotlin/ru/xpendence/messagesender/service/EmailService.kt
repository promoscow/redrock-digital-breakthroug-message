package ru.xpendence.messagesender.service

import ru.xpendence.messagesender.dto.EmailMessageDto
import ru.xpendence.messagesender.dto.ResponseDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.07.19
 * Time: 15:46
 * e-mail: v.chernyshov@pflb.ru
 */
interface EmailService {

    fun send(dto: EmailMessageDto): ResponseDto
}