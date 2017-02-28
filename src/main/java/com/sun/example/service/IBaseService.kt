package com.sun.example.service

import org.springframework.data.domain.Pageable

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * @author Sun
 * @version
 */
interface IBaseService<T, ID> {

    fun getById(id: ID): T?
    fun save(bean: T): T?
    fun listByExample(bean: T): List<T>
    open fun listByExample(bean: T, page: Pageable): List<T>
    open fun countByExample(bean: T): Long?
    open fun save(beans: List<T>): List<T>?
    open fun getByExample(bean: T): T?
    open fun removeById(id: ID): Unit?
    open fun removeByExample(beans: List<T>)
}