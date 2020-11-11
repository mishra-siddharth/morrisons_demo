package com.morrisons.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.morrisons.demo.entities.UserLoyalty;

public interface UserLoyaltyRepository extends CrudRepository<UserLoyalty, Integer> {

}
