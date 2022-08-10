package com.appfood.hung.service;
import com.appfood.hung.entity.CustomUserDetails;

import com.appfood.hung.entity.User;
import com.appfood.hung.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("No customer found with the given email.");
        }

        return new CustomUserDetails(user);
    }

}
