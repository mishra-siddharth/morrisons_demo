package com.morrisons.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User Loyalty.
 */
@Entity
@Table(name="user_loyalty")
public class UserLoyalty {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userId; 
	
	private Integer loyalty_points;
	
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getLoyalty_points() {
		return loyalty_points;
	}
	public void setLoyalty_points(Integer loyalty_points) {
		this.loyalty_points = loyalty_points;
	}
	@Override
	public String toString() {
		return "UserLoyalty [userId=" + userId + ", loyalty_points=" + loyalty_points + "]";
	}    
	
}
