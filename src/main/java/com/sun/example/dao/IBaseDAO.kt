package com.sun.example.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

/**
 * Description: <br/>
 * Date: 2017-02-23
 *
 * PagingAndSortingRepository : CrudRepository
 * JpaRepository : PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T>
 *
 * @author Sun
 * @version
 */
@NoRepositoryBean
interface IBaseDAO<T, ID : Serializable> : JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}