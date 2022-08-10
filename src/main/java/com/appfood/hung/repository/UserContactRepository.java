package com.appfood.hung.repository;

import com.appfood.hung.entity.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserContactRepository extends JpaRepository<UserContact, Long> {

    void deleteAllByUserId(Long userId);
}
