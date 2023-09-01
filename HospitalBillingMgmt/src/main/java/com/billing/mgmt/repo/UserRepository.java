package com.billing.mgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billing.mgmt.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	Users findByUserid(String userid);	
}
