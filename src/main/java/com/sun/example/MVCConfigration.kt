package com.sun.example

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Description: <br/>
 * Date: 2017-02-22
 *
 * @author Sun
 * @version
 */
@Configuration
@EnableTransactionManagement
//Spring就会将指定包中@Repository的类注册为bean，将bean托管给Spring
@EntityScan(basePackages = arrayOf("com.sun"))
@EnableJpaRepositories(basePackages = arrayOf("com.sun"))
class MVCConfigration {

}
