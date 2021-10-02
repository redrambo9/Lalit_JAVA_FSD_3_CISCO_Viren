package com.project.app.repository;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import com.project.app.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	  
	 @Transactional 
	 @Modifying
	 @Query(nativeQuery = true,
		       value = "update user u set u.user_password=?1 where u.user_email=?2")
	   public void findByChangePass(String newpass, String email);
	 
	  //@Query("update user set u.user_password=:pass where u.user_email=:mail")      	
	   //public List<User> findByChangePass2(@Param("pass") String newpasss, @Param("mail") String email);
}
