package com.sun.example.service

import com.sun.example.dao.IBaseDAO
import org.springframework.data.domain.Example
import org.springframework.data.domain.Pageable
import java.io.Serializable
import java.util.*

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * 1. 获取单个对象的方法用 get 做前缀。
 * 2. 获取多个对象的方法用 list 做前缀。
 * 3. 获取统计值的方法用 count 做前缀。
 * 4. 插入的方法用 save(推荐)或 insert 做前缀。
 * 5. 删除的方法用 remove(推荐)或 delete 做前缀。
 * 6. 修改的方法用 update 做前缀。

 * @author Sun
 * @version
 */
open class BaseService<T, ID : Serializable> : IBaseService<T, ID> {
    protected var dao: IBaseDAO<T, ID>? = null

    override fun getById(id: ID): T? {
        return dao?.findOne(id)
    }

    override fun getByExample(bean: T): T? {
        var example = Example.of(bean)
        return dao?.findOne(example)
    }

    override fun save(bean: T): T? {
        return dao?.save(bean)
    }

    override fun save(beans: List<T>): List<T>? {
        val saved = dao?.save(beans.toList())
        val list = ArrayList<T>()
        saved?.forEach { list.add(it) }
        return list
    }

    override fun listByExample(bean: T): List<T> {
//        val u = User()
//        u.setFirstname("Dave")
//        val matcher = ExampleMatcher.matching()
//                .withMatcher("firstname", endsWith())
//                .withIgnorePaths("lastname")
//                .withIncludeNullValues()
//                .withStringMatcherEnding()
//        val example = Example.of(u, matcher)
        val example = Example.of(bean)
        val iterable = dao?.findAll(example)
        val list = ArrayList<T>()
        iterable?.forEach { list.add(it) }
        return list
    }

    override fun listByExample(bean: T, page: Pageable): List<T> {
        var example = Example.of(bean)
        val iterable = dao?.findAll(example, page)
        val list = ArrayList<T>()
        iterable?.forEach { list.add(it) }
        return list
    }

    override fun countByExample(bean: T): Long? {
        val example = Example.of(bean)
        val count = dao?.count(example)
        return count
    }

    override fun removeById(id: ID) {
        dao?.delete(id)
    }

    override fun removeByExample(beans: List<T>) {
        dao?.deleteInBatch(beans.toList())
    }


    fun update() {
    }
}