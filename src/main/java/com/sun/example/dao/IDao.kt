package com.sun.example.dao

import com.sun.example.bean.Company
import com.sun.example.bean.User
import org.springframework.stereotype.Repository

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
@Repository
interface IUserDAO : IBaseDAO<User, Long> {

}

@Repository
interface ICompanyDAO : IBaseDAO<Company, Long> {

}

