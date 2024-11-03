package com.appt.set.web_api.data.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.appt.set.web_api.data.entity.ApiUser;
import com.appt.set.web_api.data.repository.ApiUserRepository;
import com.appt.set.web_api.exeptions.ApiUserNotFountException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ApiUserServiceImplement implements ApiUserService{

    private final ApiUserRepository repository;

    @Override
    public ApiUser findByKey(String key) {
        return repository.findByKeyValueAndActiveTrue(key)
        .orElseThrow(() -> new ApiUserNotFountException("La solicitud a la API fue rechazada"));
    }

}
