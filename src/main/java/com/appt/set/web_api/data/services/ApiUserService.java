package com.appt.set.web_api.data.services;

import java.util.Optional;

import com.appt.set.web_api.data.entity.ApiUser;

public interface ApiUserService {

    ApiUser findByKey(String key);

}
