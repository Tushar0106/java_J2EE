package com.billing.mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.mgmt.model.Users;
import com.billing.mgmt.repo.UserRepository;

@Service
public class UserService {
	
	
	@Autowired	
	private UserRepository repo;
	
	public Users logincheckEmp(Users user) {
		Users users = repo.findByUserid(user.getUserid());
		return users;
		
	}
}
