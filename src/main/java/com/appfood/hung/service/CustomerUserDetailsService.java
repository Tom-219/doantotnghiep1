package com.appfood.hung.service;

import com.appfood.hung.entity.Customer;
import com.appfood.hung.entity.CustomerUserDetails;
import com.appfood.hung.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired private CustomerRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer = repo.findByEmail(email);
        if (customer == null) {
            throw new UsernameNotFoundException("No customer found with the given email.");
        }

        return new CustomerUserDetails(customer);
    }

}
