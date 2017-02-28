package com.sun.example.controller

import com.sun.example.bean.User
import com.sun.example.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
@Controller("/users")
class UserController {

    @Autowired
    var userService: IUserService? = null

    @RequestMapping("/{id}")
    fun selectOne(request: HttpServletRequest, response: HttpServletResponse, @PathVariable id: Long): User? {
        return userService?.getById(id)
    }
}