package com.appfood.hung.repository;

import com.appfood.hung.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer findByEmail(String email);
}
