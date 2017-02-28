package com.sun.example

import com.sun.example.bean.User
import com.sun.example.service.IUserService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(SpringBootKotlin::class))
class DemoApplicationTests {


    @Autowired
    private val userService: IUserService? = null

    @Test
    fun contextLoads() {

        println(userService)

        val user = User(username = "kotlin", password = "xxcxcxc")

        val insert = userService?.save(user)
        println(insert)

        val selectById = userService?.getById(insert?.userId!!)
        println(selectById)

    }

}
