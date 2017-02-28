package com.sun.example.servlet

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Description: <br/>
 * Date: 2017-02-22
 *
 * @author Sun
 * @version
 */
@ControllerAdvice
class GlobalExceptionHandler {

    val log: Logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java);

    @ExceptionHandler
    @ResponseBody
    @Throws(Exception::class)
    fun handlerException(request: HttpServletRequest, response: HttpServletResponse, e: Exception): String {
        log.error("GlobalExceptionHandler 捕获异常 并将错误返回前台 ", e)
        throw e
    }
}