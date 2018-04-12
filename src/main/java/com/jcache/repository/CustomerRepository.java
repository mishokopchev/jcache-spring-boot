package com.jcache.repository;

import com.jcache.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by mihailkopchev on 4/12/18.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    @Query("delete from Customer c where c.id in :keys")
    void deleteAll(@Param("keys") Collection<Integer> keys);
}
