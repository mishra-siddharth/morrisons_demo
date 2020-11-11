package com.morrisons.demo.service;

import com.morrisons.demo.entities.UserLoyalty;
import com.morrisons.demo.repository.UserLoyaltyRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class UserLoyaltyServiceImpl implements UserLoyaltyService {
	
	@Autowired
	private UserLoyaltyRepository userLoyaltyRepository;

  
    @Override
    public Optional<UserLoyalty> getUserLoyaltyById(Integer id) {
        return userLoyaltyRepository.findById(id);
    }
 
}
