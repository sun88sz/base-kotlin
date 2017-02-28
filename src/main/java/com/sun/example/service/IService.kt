package com.sun.example.service

import com.sun.example.bean.Company
import com.sun.example.bean.User

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
interface IUserService : IBaseService<User, Long> {

}

interface ICompanyService : IBaseService<Company, Long> {

}

