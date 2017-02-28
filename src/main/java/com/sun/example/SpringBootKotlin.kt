package com.sun.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Description: <br/>
 * Date: 2017-02-27
 *
 * @author Sun
 * @version
 */
@SpringBootApplication(scanBasePackages = arrayOf(".", "com.sun"))
class SpringBootKotlin {

}


fun main(args: Array<String>) {
    SpringApplication.run(SpringBootKotlin::class.java, *args)
}