package com.sun.example.service

import com.sun.example.bean.User
import com.sun.example.dao.IUserDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
@Service
@Transactional
class UserService : BaseService<User, Long>(), IUserService {

    @Autowired
    fun setDAO(dao: IUserDAO) {
        this.dao = dao
    }


}