package com.morrisons.demo.service;

import java.util.Optional;

import com.morrisons.demo.entities.UserLoyalty;

public interface UserLoyaltyService {

    Optional<UserLoyalty> getUserLoyaltyById(Integer id);
}
