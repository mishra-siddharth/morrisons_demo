package com.morrisons.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morrisons.demo.entities.UserLoyalty;
import com.morrisons.demo.service.UserLoyaltyService;

/**
 * Homepage controller.
 */
@Controller
public class UserLoyaltyController {
	
	@Autowired
	private UserLoyaltyService userLoyaltyService;
	
	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String demo() {       	
        return "Demo Application";
    }

    /**
     * Return the loyalty points of a specific user determined by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/userloyalty/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserLoyalty> showUserLoyalty(@PathVariable Integer id) {   
    	UserLoyalty userLoyalty = userLoyaltyService.getUserLoyaltyById(id).get();
        return ResponseEntity.ok().body(userLoyalty);
    }

}
