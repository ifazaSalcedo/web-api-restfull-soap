package com.appt.set.web_api.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appt.set.web_api.data.entity.ApiUser;

public interface ApiUserRepository extends JpaRepository<ApiUser, Object>{

    Optional<ApiUser> findByKeyValueAndActiveTrue(String key);

}
