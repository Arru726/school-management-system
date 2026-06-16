package com.aryaveer.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryaveer.schoolmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}