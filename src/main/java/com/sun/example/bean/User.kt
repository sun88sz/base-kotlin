package com.sun.example.bean

import javax.persistence.*

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
@Entity
@Table(name = "t_base_user")
data class User(
        @Id
        @SequenceGenerator(name="userSeq", sequenceName="SEQ_USER_USERID")
        @GeneratedValue( strategy = javax.persistence.GenerationType.SEQUENCE,generator = "userSeq")
        var userId: Long? = null,
        var deptId: Long? = null,
        var username: String? = null,
        var password: String? = null,
        var sex: String? = null,
        var companyId: String? = null) {


}