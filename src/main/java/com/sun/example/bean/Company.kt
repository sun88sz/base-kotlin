package com.sun.example.bean

import java.util.*
import javax.persistence.*

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
@Entity
@Table(name = "t_base_company")
data class Company(
        @Id
        @SequenceGenerator(sequenceName = "SEQ_COMPANY_COMPANYID", name = "companySeq")
        @GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "companySeq")
        var companyId: Long? = null,
        var companyName: String? = null,
        var email: String? = null,
        var contact: String? = null,
        var contactPhone: String? = null,
        var contactMobilephone: String? = null,
        var createEmployee: Long? = null,
        var createTime: Date? = null) {


}